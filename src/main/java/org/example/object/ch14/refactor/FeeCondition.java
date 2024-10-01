package org.example.object.ch14.refactor;

import org.example.object.ch14.Call;
import org.example.object.ch14.DateTimeInterval;

import java.util.List;

public interface FeeCondition {

    List<DateTimeInterval> findTimeIntervals(Call call);
}
