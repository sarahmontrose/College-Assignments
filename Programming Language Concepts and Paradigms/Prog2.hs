{- ###################
 Sarah Montrose
 Homework #2
####################-}

module Prog2 where

threeDifferent :: Integer -> Integer -> Integer -> Bool
threeDifferent x y z = if (x /= y) && (y /= z) then True else False


sum' :: Integer -> Integer
sum' x
  | x == 0  = 0
  | x > 0   = x + sum'(x-1)

abssum :: Integer -> Integer -> Integer
abssum x y
  |x == y = abs x
  |x < y  = abs x + (abssum (x+1) y)

integerSqrt :: Integer -> Integer
integerSqrt n = floor(sqrt(fromInteger n))


exponent' :: Integer -> Integer -> Integer
exponent' x y
  | (x == 0) = 0 
  | (x == 1) = y
  | (x > 1)  = y * (exponent' y (x-1)) 

largeSmall :: (Integer, Integer, Integer) -> (Integer, Integer)
largeSmall x y z
  | (x > y) && (x > z) && (z > y) = (x,y)
  | (x > y) && (x > z) && (y > z) = (x,z)
  | (y > x) && (y > z) && (z > x) = (y,x)
  | (y > x) && (y > z) && (x > z) = (y,z)
  | (z > x) && (z > y) && (y > x) = (z,x)
  | (z > x) && (z > y) && (x > y) = (z,y)
  | (x == y) && (x > z)           = (x,z)
  | (x == y) && (z > x)           = (z,x)
  | (x == z) && (x > y)           = (x,y)
  | (x == z) && (y > x)           = (y,x)
  | (y == z) && (z > x)           = (z,x)
  | (y == z) && (x > z)           = (x,z)
  | otherwise                     = (x,y)

swap :: (Char, Char, Char, Char) -> (Char, Char, Char, Char)
swap (w,x,y,z) = (w,y,x,z)

negateOdds :: [Integer] -> [Integer]
negateOdds x = [if y `rem` 2 /= 0 then y*(-1) else y*1 | y <- x]

matches :: Integer -> [Integer] -> [Integer]
matches x y = [z | z <- y, z == x]


element :: Integer -> [Integer] -> Bool
element x y = if null (matches x y) then False else True

