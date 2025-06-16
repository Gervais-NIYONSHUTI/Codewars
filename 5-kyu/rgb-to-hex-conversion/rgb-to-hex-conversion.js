function rgb(r, g, b) {
  const c = c => c >=0 ? c : 0
  r = c(r); g = c(g); b = c(b)
  const d = d => d <= 255 ? d : 255
  r = d(r); g = d(g); b = d(b)
  const v = val => val.toString(16).length === 1 ? '0' + val.toString(16) : val.toString(16)
  return v(r).toUpperCase() + v(g).toUpperCase() + v(b).toUpperCase()
}