function findUniq(arr) {
  const arrCopy = arr.map(val => [...new Set(val.toLowerCase().split('').sort())].join(''))
  return arr[arrCopy.indexOf(arrCopy.find(val => arrCopy.indexOf(val) === arrCopy.lastIndexOf(val)))]
}
​