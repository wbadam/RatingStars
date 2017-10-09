package org.vaadin.teemu.ratingstars.gwt.client;

import java.util.HashMap;
import java.util.Map;

import com.vaadin.shared.annotations.DelegateToWidget;
import com.vaadin.v7.shared.AbstractFieldState;

public class RatingStarsState extends AbstractFieldState {
    private static final long serialVersionUID = 3623150608620619618L;

    public Map<Integer, String> valueCaptions = new HashMap<>();

    @DelegateToWidget("setAnimationEnabled")
    public boolean animated;

    @DelegateToWidget("setMaxValue")
    public int maxValue;

    @DelegateToWidget("setValue")
    public Double value;

}
