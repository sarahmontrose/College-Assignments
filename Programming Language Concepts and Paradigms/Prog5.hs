{- #################################
 Sarah Montrose
 Homework 5.
 ################################## -}

module Prog5 where

reverse' :: [a] -> [a]
reverse' a = case a of
   [] -> []
   (x:xs) -> (reverse' xs) ++ [x]

isPalindrome :: String -> Bool
isPalindrome a = case a of
   [] -> False
   (x:xs) ->  (reverse' xs) == a


safeFindAfter :: String -> [String] -> Maybe [String]
safeFindAfter _[] = Nothing
safeFindAfter a (x:xs)
   | x == a      = Just xs
   | otherwise   = safeFindAfter a xs


data Set = Set [Char] 
   | EmptySet
   deriving Show

member :: Char -> Set -> Bool
member _ (EmptySet) = False
member _ (Set [])   = False
member a (Set(x:xs))
   |a == x    = True
   |a /= x    = member a (Set(xs))
   |otherwise = False


size :: Set -> Int
size (EmptySet) = 0
size (Set [])   = 0
size (Set(x:xs)) = 1 + size(Set(xs))


add :: Char -> Set -> Set
add a (EmptySet) = (Set(a:[]))
add a (Set(b))
   | (member a (Set(b))) == True = Set(b)
   | otherwise                   = (Set(a:b))

equal :: Set -> Set -> Bool
equal (EmptySet) (EmptySet)       = True
equal (EmptySet) _                = False
equal  _ (EmptySet)               = False
equal (Set []) _                  = True
equal (Set (x:xs)) (Set (ys))
   | member x (Set(ys))           = equal (Set(xs)) (Set(ys))
   | otherwise                    = False

saferemove :: Char -> Set -> Maybe Set
saferemove _ (EmptySet) = Nothing
saferemove a (Set(x:xs))= Just(Set(ys)) where ys = [y| y <- xs, y /= a]

union :: Set -> Set -> Set
union (EmptySet) (EmptySet) = (EmptySet)
union (EmptySet) (Set(xs))  = (Set(xs))
union (Set(ys)) (EmptySet)  = (Set(ys))
union (Set([])) (Set(xs))   = (Set(xs))
union (Set(y:ys)) (Set(xs))
   | y `elem` xs = union (Set(ys)) (Set(xs))
   | otherwise   = union (Set(ys)) (Set(y:xs))

intersection :: Set -> Set -> Set
intersection (EmptySet) (EmptySet) = (EmptySet)
intersection (EmptySet) (Set(xs))  = (EmptySet)
intersection (Set(ys)) (EmptySet)  = (EmptySet)
intersection (Set(ys)) (Set(xs))   = Set(zs) where zs = [z|z <- ys, z `elem` xs]
