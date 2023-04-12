Array.prototype.last = function() {
   return this[0]==undefined?-1:this[this.length-1];
};

/**
 * const arr = [1, 2, 3];
 * arr.last(); // 3
 */