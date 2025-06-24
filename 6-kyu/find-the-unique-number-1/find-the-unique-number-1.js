function findUniq(arr) {
  const arrCopy = arr.filter(val => arr.indexOf(val) === arr.lastIndexOf(val))
  return arrCopy.length === 1 ? arrCopy[0] : arr.filter(val => arr.indexOf(val) !== arr.lastIndexOf(val))[0]
}
​