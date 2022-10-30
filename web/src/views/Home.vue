<script lang="ts" setup>
import axios from 'axios'
axios.get("http://127.0.0.1:8080/ebook/list?name=Python").then((response)=>{
  console.log(response);
  
})



</script>

<template>
  <div class="home">
    <h2>home</h2>
  </div>
</template>

<style lang="less" scoped>

</style>
