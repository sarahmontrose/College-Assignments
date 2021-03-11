{- ########################################################
	Sarah Montrose
	Homework 7
######################################################## -}

module Prog7 where

unique :: Eq a => [a] -> [a]
unique [] = []
unique (x:xs)
   |x `elem` (unique xs) = [y | y <- (unique xs), y /= x]
   |otherwise            = x:(unique xs)

data Expr1 = Val1 Int
   |Add1 Expr1 Expr1
   |Sub1 Expr1 Expr1

value1 :: Expr1 -> Int
value1 (Val1 x)   = x
value1 (Add1 x y) = (value1 x) + (value1 y)
value1 (Sub1 x y) = (value1 x) - (value1 y)


data Expr2 = Val2 Int
           | Add2 Expr2 Expr2
           | Sub2 Expr2 Expr2
           | Mul2 Expr2 Expr2
           | Div2 Expr2 Expr2 

instance Show Expr2 where
   show (Val2 x)   = show x 
   show (Add2 x y) = "(" ++ show x ++ "+" ++ show y ++ ")"
   show (Sub2 x y) = "(" ++ show x ++ "-" ++ show y ++ ")"
   show (Mul2 x y) = "(" ++ show x ++ "*" ++ show y ++ ")"
   show (Div2 x y) = "(" ++ show x ++ "/" ++ show y ++ ")"

value2 :: Expr2 -> Maybe Int
value2 (Val2 x)   = Just x
value2 (Add2 x y)
   |(value2 x) /= Nothing && (value2 y) /= Nothing = Just ((getV(value2 x)) + (getV(value2 y)))
   |otherwise = Nothing
value2 (Sub2 x y)
   |(value2 x) /= Nothing && (value2 y) /= Nothing = Just ((getV(value2 x)) - (getV(value2 y)))
   |otherwise = Nothing
value2 (Mul2 x y)
   |(value2 x) /= Nothing && (value2 y) /= Nothing = Just ((getV(value2 x)) * (getV(value2 y)))
   |otherwise = Nothing
value2 (Div2 x y)
   |(value2 x) /= Nothing && (value2 y) && (getV(value2 y)) /= 0 = Just ((getV(value2 x)) `div` (getV(value2 y)))
   |otherwise = Nothing

getV :: Maybe Int -> Int
getV (Just x)  = x
getV (Nothing) = 0

piglatinize :: String -> String 
piglatinize [] = ""
piglatinize pigL = if (hasVowel (head pigL))
                  then pigL ++ "yay"
                  else if (not (hasVowel (head(tail(pigL))))) 
                    then ((tail(tail pigL))) ++ [(head pigL)] ++ [(head(tail pigL))] ++ "ay"
                    else (tail pigL)++[(head pigL)]++"ay"

hasVowel :: Char -> Bool
hasVowel x = x `elem` ['a','e','i','o','u','A','E','I','O','U']

data Tree x = Leaf x | Node (Tree x)(Tree x)

balanced :: Tree x -> Bool 
balanced (Leaf x) = True
balanced (Node left right)
   |(lNum left) - (lNum right) == 1  = True 
   |(lNum left) - (lNum right) == -1 = True
   |(lNum left) - (lNum right) == 0  = True
   | otherwise                       = False

lNum :: Tree x -> Int
lNum (Leaf x) = 1
lNum (Node left right) = lNum left + lNum right

data Expr3 = Val3 Int
   |Add3 Expr3 Expr3
   |Sub3 Expr3 Expr3
   |Mul3 Expr3 Expr3
   |Div3 Expr3 Expr3
   |If BExpr3 Expr3 Expr3
  deriving Show

data BExpr3 = BoolLit Bool
   |Or BExpr3 BExpr3
   |EqualTo Expr3 Expr3 
   |LessThan Expr3 Expr3
  deriving Show

bEval :: BExpr3 -> Bool
bEval (BoolLit True)  = True
bEval (BoolLit False) = False
bEval (Or x y)
   |bEval x || bEval y = True
   |otherwise          = False
bEval (EqualTo x y)
   |getV(value3 x) == getV(value3 y) = True
   |otherwise                        = False
bEval (LessThan x y)
   |getV(value3 x) < getV(value3 y) = True
   |otherwise                       = False
   

value3 :: Expr3 -> Maybe Int
value3 (Val3 x)   = (Just x)
value3 (Add3 x y) 
   |(value3 x) /= Nothing && (value3 y) /= Nothing = Just ((getV(value3 x)) + (getV(value3 y)))
   |otherwise = Nothing
value3 (Sub3 x y)
   |(value3 x) /= Nothing && (value3 y) /= Nothing = Just ((getV(value3 x)) - (getV(value3 y)))
   |otherwise = Nothing
value3 (Mul3 x y)
   |(value3 x) /= Nothing && (value3 y) /= Nothing = Just ((getV(value3 x)) * (getV(value3 y)))
   |otherwise = Nothing
value3 (Div3 x y)
   |(value3 x) /= Nothing && (value3 y) /= Nothing && (getV(value3 y)) /= 0 = Just ((getV(value3 x)) `div` (getV(value3 y)))
   |otherwise = Nothing
value3 (If a x y)
   |bEval a        = Just(getV(value3 x))
   |otherwise      = Just(getV(value3 y))

