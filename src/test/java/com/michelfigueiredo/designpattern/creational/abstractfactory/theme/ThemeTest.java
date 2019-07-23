package com.michelfigueiredo.designpattern.creational.abstractfactory.theme;

import com.michelfigueiredo.designpattern.creational.abstractfactory.theme.dark.DarkDialog;
import com.michelfigueiredo.designpattern.creational.abstractfactory.theme.dark.DarkThemeFactory;
import com.michelfigueiredo.designpattern.creational.abstractfactory.theme.dark.DarkToolbar;
import com.michelfigueiredo.designpattern.creational.abstractfactory.theme.light.LightDialog;
import com.michelfigueiredo.designpattern.creational.abstractfactory.theme.light.LightThemeFactory;
import com.michelfigueiredo.designpattern.creational.abstractfactory.theme.light.LightToolbar;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author mfigueiredo
 */
class ThemeTest {

    @Test
    void can_get_dark_toolbar() {
        Toolbar toolbar = new DarkToolbar();
        assertThat( toolbar, instanceOf(DarkToolbar.class));
    }

    @Test
    void can_get_light_toolbar() {
        Toolbar toolbar = new LightToolbar();
        assertThat( toolbar, instanceOf(LightToolbar.class));
    }

    @Test
    void can_get_dark_dialog() {
        Dialog toolbar = new DarkDialog();
        assertThat( toolbar, instanceOf(DarkDialog.class));
    }

    @Test
    void can_get_light_dialog() {
        Dialog toolbar = new LightDialog();
        assertThat( toolbar, instanceOf(LightDialog.class));
    }

    @Test
    void can_get_light_theme() {
        Theme theme = new LightThemeFactory();
        assertThat( theme, instanceOf(LightThemeFactory.class));
    }


    @Test
    void can_get_dark_theme() {
        Theme theme = new DarkThemeFactory();
        assertThat( theme, instanceOf(DarkThemeFactory.class));
    }

    @Test
    void can_show_dark_theme_toolbar() {
        Theme theme = new DarkThemeFactory();
        Toolbar toolbar = theme.getToolbar();
        assertThat( toolbar, instanceOf( DarkToolbar.class ));
    }


    @Test
    void can_show_dark_theme_dialog() {
        Theme theme = new DarkThemeFactory();
        Dialog dialog = theme.getDialog();
        assertThat( dialog, instanceOf( DarkDialog.class ));
    }

    @Test
    void can_show_light_theme_toolbar() {
        Theme theme = new LightThemeFactory();
        Toolbar toolbar = theme.getToolbar();
        assertThat( toolbar, instanceOf( LightToolbar.class ));
    }


    @Test
    void can_show_light_theme_dialog() {
        Theme theme = new LightThemeFactory();
        Dialog dialog = theme.getDialog();
        assertThat( dialog, instanceOf( LightDialog.class ));
    }

    @Test
    void can_draw_dark_toolbar() {
        Toolbar toolbar = new DarkToolbar();
        assertEquals( toolbar.draw(), "dark_toolbar" );
    }

    @Test
    void can_draw_light_toolbar() {
        Toolbar toolbar = new LightToolbar();
        assertEquals( toolbar.draw(), "light_toolbar" );
    }

    @Test
    void can_draw_dark_dialog() {
        Dialog dialog= new DarkDialog();
        assertEquals( dialog.draw(), "dark_dialog" );
    }

    @Test
    void can_draw_light_dialog() {
        Dialog dialog= new LightDialog();
        assertEquals( dialog.draw(), "light_dialog" );
    }

}
