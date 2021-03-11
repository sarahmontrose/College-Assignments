{- ##################################
 Sarah Montrose
 10/16/19
 Homework 3.
 ################################## -}
module Prog3 where

productLastPart :: Int -> [Int] -> Int
productLastPart x xs
   | length xs == x = product xs
   | length xs > x  = productLastPart x (tail xs)

init' :: [Int] -> [Int]
init' xs = reverse (tail(reverse xs))  

init'' :: [Int] -> [Int]
init'' [_]     = []
init'' (x:xs) = x : init'' xs

elemAt :: Int -> [Int] -> Int
elemAt x (y:ys) 
   | x == 1 = y
   | x > 1  = elemAt (x-1) ys

numTimes :: Int -> [Int] -> Int
numTimes x [] = 0
numTimes x (y:ys) 
   | y == x = 1 + numTimes x ys
   | y /= x = 0 + numTimes x ys

lowerFirstLetter :: String -> String
lowerFirstLetter [] = []
lowerFirstLetter (x:xs)
   | x >= 'a' && x <= 'z' = (x:xs)
   | x <= 'A' && x >= 'Z' = (toEnum((fromEnum x) + 32)) : xs
   | otherwise            = x : lowerFirstLetter xs

nestedParens :: String -> Bool
nestedParens [] = True
nestedParens x 
   | head x == '(' && last x == ')' = nestedParens(tail(init(x)))
   | otherwise = False

triads :: Int -> [(Int,Int,Int)]
triads n = [(a,b,c) | a <- [1..n], b <- [1..n], c <- [1..n], a^2 + b^2 == c^2]

iSort' :: [(Float, Int, String)] -> [(Float, Int, String)]
iSort' [] = []
iSort' (x:xs)= ins' x (iSort' xs)

ins' :: (Float, Int, String) -> [(Float, Int, String)] -> [(Float, Int, String)]
ins' (a,b,c) [] = [(a,b,c)]
ins' (a,b,c) ((d,e,f):ys)
  | b < e = (a,b,c) : (d,e,f) : ys
  | otherwise = (d,e,f) : ins' (a,b,c) ys

merge :: [Int] -> [Int] -> [Int]
merge [] [] = []
merge x y = xsort (x++y)

xsort :: [Int] -> [Int]
xsort [] = []
xsort (x:xs) = xins x (xsort xs)

xins :: Int -> [Int] -> [Int]
xins x [] = [x]
xins x (y:ys)
   | x > y    = x:y:ys
   | otherwise = y:(xins x ys)

