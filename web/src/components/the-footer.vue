<script lang="ts">
import { defineComponent } from 'vue';

export default defineComponent({
  name: 'the-footer',
  props: {
    msg: String,
  },

});



</script>

<template>
  <a-layout-footer style="text-align: center">
    寒舞电子书
  </a-layout-footer>
</template>

<style lang="less" scoped>

</style>
