function findUniq(arr) {
  const arrCopy = arr.map(val => [...new Set(val.toLowerCase().split('').sort())].join(''))
  return arr[arrCopy.findIndex(v => arrCopy.indexOf(v) === arrCopy.lastIndexOf(v))]
}