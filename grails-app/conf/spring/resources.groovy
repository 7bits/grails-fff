import com.recruiters.security.CustomUserDetailsService
import org.mybatis.spring.SqlSessionFactoryBean
import org.mybatis.spring.mapper.MapperScannerConfigurer
// Place your Spring DSL code here
beans = {
    groovyPageResourceLoader(com.cadrlife.jhaml.grailsplugin.HamlGroovyPageResourceLoader) {
        baseResource = "file:."
        pluginSettings = new grails.util.PluginBuildSettings(grails.util.BuildSettingsHolder.settings)
    }

    sqlSessionFactory(SqlSessionFactoryBean) {
       dataSource = ref('dataSource')
    }

    mapperScannerConfigurer(MapperScannerConfigurer) {
        basePackage = 'com.recruiters.repository.mapper'
    }

    userDetailsService(CustomUserDetailsService) {
        userRepository = ref('userRepository')
    }
}
