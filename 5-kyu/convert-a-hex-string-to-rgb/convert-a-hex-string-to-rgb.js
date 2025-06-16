function hexStringToRGB(hexString) {
  return {r: parseInt(hexString.slice(1,3).toString(10),16), g: parseInt(hexString.slice(3,5).toString(10), 16),b: parseInt(hexString.slice(5,7).toString(10),16)}
}