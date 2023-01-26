class Solution {

    /**
     * @param String $pattern
     * @param String $s
     * @return Boolean
     */
    function wordPattern($pattern, $s) {
        $ar=explode(" ",$s);
        $len=count($ar);
        $map=array();
        if(strlen($pattern)!=$len)return false;
        for($i=0;$i<count($ar);$i++){
            if(array_key_exists($pattern[$i],$map)){
                if($map[$pattern[$i]]!=$ar[$i]) return false;
            }else{
                if(in_array($ar[$i],$map)) return false;
                $map[$pattern[$i]] = $ar[$i];
            }
        }
        return true;
    }
}
