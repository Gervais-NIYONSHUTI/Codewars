function count(string) {
  const result = {}
  string.split('').forEach(val => result[val] ? result[val] += 1 : result[val] = 1)
  return result;
}