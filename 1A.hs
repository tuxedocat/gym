{-# LANGUAGE TypeSynonymInstances #-}
class Scan a where scan' :: String -> a
instance Scan Int where scan' n = read n
instance Scan Char where scan' (x:_) = x
instance Scan Float where scan' f = read f
instance Scan Double where scan' d = read d
instance Scan Integer where scan' n = read n
instance Scan String where scan' x = x
instance (Scan a,Scan b) => Scan (a,b) where scan' x = scan'' (words x)
                                                 where
                                                   scan'' (x:y:_) = (scan' x,scan' y)
instance (Scan a,Scan b,Scan c) => Scan (a,b,c) where scan' x = scan'' (words x)
                                                          where
                                                            scan'' (x:y:z:_) = (scan' x,scan' y,scan' z)
instance (Scan a,Scan b,Scan c,Scan d) => Scan (a,b,c,d) where scan' x = scan'' (words x)
                                                                   where
                                                                     scan'' (w:x:y:z:_) = (scan' w,scan' x,scan' y,scan' z)
instance (Scan a,Scan b,Scan c,Scan d,Scan e) => Scan (a,b,c,d,e) where scan' x = scan'' (words x)
                                                                            where
                                                                              scan'' (v:w:x:y:z:_) = (scan' v,scan' w,scan' x,scan' y,scan' z)
class Ans a where showans :: a -> String
instance Ans Int where showans x = show x
instance Ans Char where showans x = [x]
instance Ans Float where showans x = show x
instance Ans Double where showans x = show x
instance Ans Integer where showans x = show x
instance Ans String where showans x = x
instance (Ans a, Ans b) => Ans (a,b) where
    showans (x,y) = showans x ++ " " ++ showans y
instance (Ans a, Ans b,Ans c) => Ans (a,b,c) where
    showans (x,y,z) = showans x ++ " " ++ showans y ++ " " ++ showans z

scan :: (Scan a) => IO a
scan = do n <- getLine
          return (scan' n)

scans :: (Scan a) => Int -> IO [a]
scans 0 = return []
scans n = do x <- scan
             xs <- scans (n-1)
             return (x:xs)

putAnsLn :: (Ans a) => a -> IO ()
putAnsLn ans = putStrLn (showans ans)

putAnsLns :: (Ans a) => [a] -> IO ()
putAnsLns (x:xs) = do putAnsLn x
                      putAnsLns xs
putAnsLns [] = return ()

putDebugLn :: (Show a) => a -> IO ()
putDebugLn ans = putStrLn (show ans)


-- | problem 1A, body
fillSquare :: Int -> Int-> Int -> Integer
fillSquare n m a = widthnum * heightnum
    where widthnum = ceiling((fromIntegral (n :: Int))/(fromIntegral (a :: Int )))
          heightnum = ceiling((fromIntegral (m :: Int))/(fromIntegral (a :: Int)))
-- | main with IO
main = do
    (n,m,a) <- scan::IO (Int,Int,Int)
    putDebugLn $ fillSquare n m a
