{- ##################################
   Sarah Montrose
   Homework 1
   ################################## -}

module Prog1 where

isSingleDigit :: Integer -> Bool
isSingleDigit i = i > (-10) && i < 10

dividesEvenly :: Integer -> Integer -> Bool
dividesEvenly x y = (x `mod` y) == 0

middle :: Integer -> Integer -> Integer -> Integer
middle a b c  
  | threeMax a b c == a = twoMax b c
  | threeMax a b c == b = twoMax a c
  | threeMax a b c == c = twoMax a b

nand :: Bool -> Bool -> Bool
nand x y = not(x && y)

triangleArea :: Integer -> Integer -> Float
triangleArea b h = 0.5 * fromIntegral b * fromIntegral h

floorDecimal :: Float -> Float 
floorDecimal x = fromInteger(floor x)

isNotALetter :: Char -> Bool
isNotALetter x = not(x >='A' && x <= 'Z') && not(x >= 'a' && x <= 'z')

letterGrade :: Integer -> String
letterGrade x
   | x >= 93 = "A"
   | x >= 90 = "A-"
   | x >= 87 = "B+"
   | x >= 83 = "B"
   | x >= 80 = "B-"
   | x >= 77 = "C+"
   | x >= 73 = "C"
   | x >= 70 = "C-"
   | x >= 67 = "D+"
   | x >= 63 = "D"
   | x >= 60 = "D-"
   | x < 60 = "F"

averageThree :: Integer -> Integer -> Integer -> Float
averageThree a b c = fromIntegral(a + b + c) / 3

howManyBelowAverage :: Integer -> Integer -> Integer -> Integer
howManyBelowAverage a b c
  | floor(averageThree a b c) > a && floor(averageThree a b c) > b                                     = 2
  | floor(averageThree a b c) > b && floor(averageThree a b c) > c                                     = 2
  | floor(averageThree a b c) > a && floor(averageThree a b c) > c                                     = 2
  | floor(averageThree a b c) > a                                                                      = 1
  | floor(averageThree a b c) > b                                                                      = 1
  | floor(averageThree a b c) > c                                                                      = 1
  | otherwise                                                                                          = 0

twoMax x y
  | x >= y    = x
  | otherwise = y

threeMax x y z
  | (twoMax x y) >= z  = twoMax x y
  | otherwise          = z





