class Solution {

    /**
     * @param String $pattern
     * @param String $s
     * @return Boolean
     */
    function wordPattern($pattern, $s) {
        $ar=explode(" ",$s);
        $len=count($ar);
        $ar_check=array();
        if(strlen($pattern)!=$len)return false;
        for($i=0;$i<count($ar);$i++){
           if(array_key_exists($pattern[$i],$ar_check)&&$ar_check[$pattern[$i]]!=$ar[$i])return false;
            else $ar_check[$pattern[$i]]=$ar[$i];
        }
         $counts = array_count_values($ar_check);
        foreach ($counts as $count) {
            if ($count > 1) {
                return false;
            }
        }
        return true;
    }
}