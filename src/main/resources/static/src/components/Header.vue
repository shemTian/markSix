
<script>
export default {
  name: "Header",
  data() {
      return {
        activeIndex: '1',
        activeIndex2: '1'
      };
    },
    methods: {
      handleSelect(key, keyPath) {
        console.log(key, keyPath);
      }
    }
};
</script>
<!-- <script src="./header.js"></script> -->
<template src="./header.html"></template>
<style lang="less" src="./header.less" scoped></style>