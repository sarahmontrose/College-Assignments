{- ####################################
   Sarah Montrose
   Homework 8.
####################################### -}
module Prog8 where

sumSqNeg :: [Int] -> Int
sumSqNeg xs = foldr (+) 0 (map (^2) (filter (<0) xs)) 

containing :: Eq a => [a] -> [a] -> Bool
containing x [] = False
containing [] y = True
containing (x:xs) y
  | x `elem` y = containing xs y
  | otherwise  = False

total :: (Int -> Int) -> [Int] -> Int
total x y = sum (map x y)

containing' :: Eq a => [a] -> [a] -> Bool
containing' _ [] = False
containing' xs ys = foldr (&&) True (map elem' xs)
   where
      elem' a
         |a `elem` ys        = True
         |otherwise          = False

lengths :: [String] -> [Int]
lengths xs = map length xs

product' :: Num a => [a] -> a
product' xs = foldr (*) 1 xs 

max' :: Ord a => [a] -> a
max' x = foldr max (last x) x

append' :: [a] -> [a] -> [a]
append' x y = foldr (:) y x 

filterFirst :: (a -> Bool) -> [a] -> [a]
filterFirst x ys = foldr (:) [] (fltrFirst x ys)
  where
    fltrFirst _ [] = []
    fltrFirst a (b:bs)
      | x b       = b:fltrFirst x bs
      | otherwise = bs

filterLast :: (a -> Bool) -> [a] -> [a]
filterLast x ys = reverse (foldr (:) [] (filterFirst x (reverse ys)))
