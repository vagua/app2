package com.example.app2;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.app2.databinding.FragmentGameBindingImpl;
import com.example.app2.databinding.FragmentGameloseBindingImpl;
import com.example.app2.databinding.FragmentGamewinBindingImpl;
import com.example.app2.databinding.FragmentWelcomeBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTGAME = 1;

  private static final int LAYOUT_FRAGMENTGAMELOSE = 2;

  private static final int LAYOUT_FRAGMENTGAMEWIN = 3;

  private static final int LAYOUT_FRAGMENTWELCOME = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.app2.R.layout.fragment_game, LAYOUT_FRAGMENTGAME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.app2.R.layout.fragment_gamelose, LAYOUT_FRAGMENTGAMELOSE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.app2.R.layout.fragment_gamewin, LAYOUT_FRAGMENTGAMEWIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.app2.R.layout.fragment_welcome, LAYOUT_FRAGMENTWELCOME);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTGAME: {
          if ("layout/fragment_game_0".equals(tag)) {
            return new FragmentGameBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_game is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTGAMELOSE: {
          if ("layout/fragment_gamelose_0".equals(tag)) {
            return new FragmentGameloseBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_gamelose is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTGAMEWIN: {
          if ("layout/fragment_gamewin_0".equals(tag)) {
            return new FragmentGamewinBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_gamewin is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTWELCOME: {
          if ("layout/fragment_welcome_0".equals(tag)) {
            return new FragmentWelcomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_welcome is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/fragment_game_0", com.example.app2.R.layout.fragment_game);
      sKeys.put("layout/fragment_gamelose_0", com.example.app2.R.layout.fragment_gamelose);
      sKeys.put("layout/fragment_gamewin_0", com.example.app2.R.layout.fragment_gamewin);
      sKeys.put("layout/fragment_welcome_0", com.example.app2.R.layout.fragment_welcome);
    }
  }
}
