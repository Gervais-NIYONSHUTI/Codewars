function highestRank(arr){
  const arrCopy = arr.sort((a,b) => b-a).map(v => arr.filter(val => val === v).length)
  return arr[arrCopy.indexOf(Math.max(...arrCopy))]
}