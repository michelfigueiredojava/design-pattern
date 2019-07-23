package com.michelfigueiredo.designpattern.creational.abstractfactory.theme;

import com.michelfigueiredo.designpattern.creational.abstractfactory.theme.dark.DarkThemeFactory;
import com.michelfigueiredo.designpattern.creational.abstractfactory.theme.light.LightThemeFactory;

/**
 * @author mfigueiredo
 */
public class FactoryProvider {
    Theme create( String themeName ){
        switch ( themeName ){
            case "Dark": return new DarkThemeFactory();
            case "Light": return new LightThemeFactory();
            default:throw new IllegalArgumentException();
        }
    }
}
