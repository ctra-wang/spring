
前提在bean中导入：`<context:annotation-config/>`
- @Autowired：自动装配 （先 byType 后 byName）
- @Qualifier：如果Autowired 不能唯一自动装配上属性，则需要通过@Qualifier(value="xxx")
- @Nullable：字段标记了这个注解，说明这个字段可以为null
- @Resource：自动装配（先 byName 后 byType）
- @Component：