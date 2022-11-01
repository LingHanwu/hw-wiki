<script lang="ts" setup>
import axios from 'axios'
import { onMounted, ref } from 'vue';
const ebooks = ref()
// 生命周期
onMounted(() => {
  axios.get("http://127.0.0.1:8080/ebook/list?name=Python").then((response) => {
    console.log(response);
    const data = response.data;
    ebooks.value = data.content;
    console.log(ebooks);

  })
})

</script>

<template>
  <div class="home">
    <h2>home</h2>
    <pre>{{ ebooks }}</pre>
  </div>
</template>

<style lang="less" scoped>

</style>
