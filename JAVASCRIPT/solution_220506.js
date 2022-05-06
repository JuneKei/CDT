process.stdin.setEncoding("utf8");
process.stdin.on("data", (data) => {
  const n = data.split(" ");
  const a = Number(n[0]),
    b = Number(n[1]);

  //repeat:문자 반복
  const s = "*".repeat(a);
  for (var i = 0; i < n[1]; i++) {
    console.log(s);
  }
});
