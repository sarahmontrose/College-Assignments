{- ##################################
 Sarah Montrose
 Homework 4.
 ################################## -}

module Prog4 where
morerecent :: (Int, Int, Int) -> (Int, Int, Int) -> (Int, Int, Int)
morerecent (x1,y1,z1) (x2,y2,z2)
   | z1 > z2 = (x1, y1, z1)
   | z2 > z1 = (x2, y2, z2)
   | x1 > x2 = (x1, y1, z1)
   | x2 > x1 = (x2, y2, z2)
   | y1 > y2 = (x2, y1, z1)
   | y2 > y1 = (x2, y2, z2)
   | otherwise = (x2, y2, z2) 

numInMonth :: [(Int, Int, Int)] -> Int -> Int
numInMonth xs x = sum[1 | (x1, y1, z1) <- xs, x1 == x]

datesInMonth :: [(Int, Int, Int)] -> Int ->[(Int, Int, Int)]
datesInMonth xs x = [(x1, y1, z1) | (x1, y1, z1) <- xs, x1 == x]

month2Str :: (Int, Int, Int) -> String
month2Str (x, y , z)
   | x == 1  = "January"
   | x == 2  = "February"
   | x == 3  = "March"
   | x == 4  = "April"
   | x == 5  = "May"
   | x == 6  = "June"
   | x == 7  = "July"
   | x == 8  = "August"
   | x == 9  = "September"
   | x == 10 = "October"
   | x == 11 = "November"
   | x == 12 = "December"

date2Str :: (Int, Int, Int) -> String
date2Str (x, y, z) = month2Str (x, y, z) ++ " " ++ show y ++ ", " ++ show z

monthLookup :: Int -> Int
monthLookup x
   | x <= 31  = 1
   | x <= 59  = 2
   | x <= 90  = 3
   | x <= 120 = 4
   | x <= 151 = 5
   | x <= 181 = 6
   | x <= 212 = 7
   | x <= 243 = 8
   | x <= 273 = 9
   | x <= 304 = 10
   | x <= 334 = 11
   | x <= 365 = 12

monthRange :: Int -> Int -> [Int]
monthRange s e  = [x..y]
   where 
    x = monthLookup s
    y = monthLookup e

validDate :: (Int, Int, Int) -> Bool
validDate (x, y, z)
   | x > 12 || x < 1   = False
   | y < 1 && y > 31   = False
   | z < 1             = False
   | x == 2 && y > 28  = False
   | x == 4 && y > 30  = False
   | x == 6 && y > 30  = False
   | x == 9 && y > 30  = False
   | x == 11 && y > 30 = False
   | otherwise         = True 

validLeapDate :: (Int, Int, Int) -> Bool
validLeapDate (x, y, z)
   | x /= 2 || y /= 29                  = False
   | z `mod` 100 == 0                   = False
   | z `mod` 400 == 0 || z `mod` 4 == 0 = True
   | otherwise                          = False

date2Num :: (Int, Int, Int) -> Int
date2Num (x, y, z) 
   | x == 1  = 0 + y
   | x == 2  = 31 + y
   | x == 3  = 59 + y 
   | x == 4  = 90 + y
   | x == 5  = 120 + y
   | x == 6  = 151 + y
   | x == 7  = 181 + y
   | x == 8  = 212 + y
   | x == 9  = 243 + y
   | x == 10 = 273 + y
   | x == 11 = 304 + y
   | x == 12 = 334 + y
 

season :: (Int, Int, Int) -> String
season (x, y, z)
   | a >= springS && a <= springE = "Spring"
   | a >= summerS && a <= summerE = "Summer"
   | a >= fallS   && a <= fallE   = "Fall"
   | otherwise                    = "Winter"
   where
     a       = date2Num(x, y, z)
     springS = date2Num(3, 20, 2019)
     springE = date2Num(6, 20, 2019)
     summerS = date2Num(6, 21, 2019)
     summerE = date2Num(9, 22, 2019)
     fallS   = date2Num(9, 23, 2019)
     fallE   = date2Num(12, 21, 2019)
     winterS = date2Num(12, 22, 2019)
     winterE = date2Num(3, 19, 2020)

