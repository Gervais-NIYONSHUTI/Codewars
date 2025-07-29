function range(...val){
  const res = []
  switch (val.length) {
    case 1:
      for(let i = 1; i<=val[0]; i++) res.push(i)
      break;
    case 2:
      for(let i = val[0]; i<=val[1]; i++) res.push(i)
      break;
    case 3:
      for(let i = val[0]; i<=val[2]; i+= val[1]) res.push(i)
      break;
  }
  return res
}