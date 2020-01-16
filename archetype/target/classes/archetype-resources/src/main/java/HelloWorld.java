#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.bukkit.plugin.java.JavaPlugin;

public class HelloWorld extends JavaPlugin {
    private static HelloWorld instance;

    @Override
    public void onEnable() {
        instance = this;

        getLogger().info("Hello World!");
    }

    @Override
    public void onDisable() {
    }

    public static HelloWorld getInstance() {
        return instance;
    }
}
