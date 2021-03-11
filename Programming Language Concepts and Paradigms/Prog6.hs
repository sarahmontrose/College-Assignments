{- ##################################
 Sarah Montrose
 Homework 6.
 ################################## -}

module Prog6 where

data Tree1 = Leaf1 Int
 | Node1 Int Tree1 Tree1

preorder :: Tree1 -> [Int]
preorder (Leaf1 x) = [x]
preorder (Node1 y left right) = [y] ++ preorder left ++ preorder right
 
postorder :: Tree1 -> [Int]
postorder (Leaf1 x) = [x]
postorder (Node1 y left right) = postorder left ++ postorder right ++ [y]

sumPositives :: Tree1 -> Int
sumPositives tree = sum([x | x <- xs, x >= 0])
   where xs = preorder tree 

countLeaves :: Tree1 -> Int
countLeaves(Leaf1 _)= 1
CountLeaves (Node1 x left right) = 0 + (countLeaves left) +
                                   (countLeaves right)  

depth :: Tree1 -> Int
depth (Leaf1 _)                     = 1
depth (Node 1_ left right)
   |(depth left) >= (depth right)   = (depth left) + 1
   | otherwise                      = (depth right) + 1

data Tree2 a = Leaf2 a
 | Node2 [Tree2 a]

occurs :: Eq a => a -> Tree2 a -> Bool
occurs x (Leaf2 y)      = x == y
occurs x (Node2 [])     = False
occurs x (Node2 (y:ys)) = occurs x y || occurs x (Node2 ys)

countInteriorNodes :: Tree2 a -> Int
countInteriorNodes (Leaf2 x)    = 0
countInteriorNodes (Node2 [])   = 0
countInteriorNodes (Node2 tree) = 1 + sum[countInteriorNodes x | x <- tree,
                                          isNode x]
isNode :: Tree2 x -> Bool
isNode (Leaf2_) = False

sumTree :: Tree2 Int -> Int
sumTree (Leaf2 x)      = x
sumTree (Node2 [])     = 0
sumTree (Node2 (y:ys)) = sumTree y + sumTree (Node2 ys)

pre2 :: Tree2 a -> [a]
pre2 (Leaf2 x)      = [x]
pre2 (Node2 [])     = []
pre2 (Node2 (y:ys)) = pre2 y ++ pre2(Node2 ys)

depthK :: Int -> Tree2 a -> [a]
depthK 0 (Leaf2 y)  = [y]
depthK 1 (Node2 xs) = [valueFromLeaf x | x <- xs, isNode x == False]
depthK a (Node2 ((Leaf2 x):xs))
   |null xs    =[]
   |otherwise  = depthK a (Node2 xs)
depthK a (Node2 ((Node2 x):xs))
   |null xs   = depthK (a-1) (Node2 x)
   |otherwise = depthK (a-1) (Node2 x) ++ depthK (a) (Node2 xs)
depthK a_     = []

valueFromLeaf :: Tree2 a -> a
valueFromLeaf (Leaf2 n) = n
