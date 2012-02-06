import Data.List
import Control.Monad
import Control.Arrow
 
doWhile p f n = (n:) $ takeWhile p $ unfoldr (Just.(id &&& f)) $ succ n-- | problem 71A


checkWatermelon :: Int -> String
checkWatermelon w
    | w == 2                  = "NO"
    | (even w)&&even(w - 2)   = "YES"
    | otherwise               = "NO"

-- | main with IO
main = do
    numl <- getLine
    let num = read ((words numl) !! 0) :: Int
    mapM_ print $ doWhile ((/=0).(`mod`num)) succ 0
