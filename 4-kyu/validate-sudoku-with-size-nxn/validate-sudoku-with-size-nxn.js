var Sudoku = function(data) 
{
  return {
    isValid: function() {
      const lim = []
      let x = 0
      const verticalArr = [], box = []
      for(let item of data[0]) lim.push(++x)
      for(let index in data) verticalArr.push(data.map(val => val[index]))
      if(!structuredClone(data).every(val => val.sort((a,b) => a-b).join()===lim.join())) return false
      if(!verticalArr.every(val => val.sort((a,b) => a-b).join()===lim.join())) return false
      for(let x = 0; x<=data.length-Math.sqrt(data.length); x+=Math.sqrt(data.length)){
        for(let i = 0; i<=data.length-Math.sqrt(data.length); i+=Math.sqrt(data.length)){
          box.push([...data.map(val => val.slice(i,i+Math.sqrt(data.length))).slice(x,x+Math.sqrt(data.length)).join().split(',').map(x => +x)])
        }
      }
      if(!box.every(val => val.sort((a,b) => a-b).join()===lim.join())) return false
      return true
    }
  };
};