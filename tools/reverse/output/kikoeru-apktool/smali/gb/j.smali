.class public final Lgb/j;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lgb/j;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 5

    .line 1
    iget v0, p0, Lgb/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lv7/h;

    .line 7
    .line 8
    iget-object p1, p1, Lv7/h;->a:Ljava/lang/String;

    .line 9
    .line 10
    check-cast p2, Lv7/h;

    .line 11
    .line 12
    iget-object p2, p2, Lv7/h;->a:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {p1, p2}, Lud/b;->j(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    :pswitch_0
    check-cast p1, Lv7/f;

    .line 20
    .line 21
    iget-object p1, p1, Lv7/f;->a:Ljava/lang/String;

    .line 22
    .line 23
    check-cast p2, Lv7/f;

    .line 24
    .line 25
    iget-object p2, p2, Lv7/f;->a:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {p1, p2}, Lud/b;->j(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1

    .line 32
    :pswitch_1
    check-cast p1, Ljava/util/Map$Entry;

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Ljava/lang/Integer;

    .line 39
    .line 40
    check-cast p2, Ljava/util/Map$Entry;

    .line 41
    .line 42
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    check-cast p2, Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-static {p1, p2}, Lud/b;->j(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    return p1

    .line 53
    :pswitch_2
    check-cast p1, Ljava/util/Map$Entry;

    .line 54
    .line 55
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Ljava/lang/Integer;

    .line 60
    .line 61
    check-cast p2, Ljava/util/Map$Entry;

    .line 62
    .line 63
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    check-cast p2, Ljava/lang/Integer;

    .line 68
    .line 69
    invoke-static {p1, p2}, Lud/b;->j(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    return p1

    .line 74
    :pswitch_3
    check-cast p1, Lmh/j;

    .line 75
    .line 76
    iget-object p1, p1, Lmh/j;->a:Llh/y;

    .line 77
    .line 78
    check-cast p2, Lmh/j;

    .line 79
    .line 80
    iget-object p2, p2, Lmh/j;->a:Llh/y;

    .line 81
    .line 82
    invoke-static {p1, p2}, Lud/b;->j(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    return p1

    .line 87
    :pswitch_4
    check-cast p1, Lm7/g;

    .line 88
    .line 89
    check-cast p2, Lm7/g;

    .line 90
    .line 91
    iget-object v0, p1, Lm7/g;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 92
    .line 93
    const/4 v1, 0x0

    .line 94
    const/4 v2, 0x1

    .line 95
    if-nez v0, :cond_0

    .line 96
    .line 97
    const/4 v3, 0x1

    .line 98
    goto :goto_0

    .line 99
    :cond_0
    const/4 v3, 0x0

    .line 100
    :goto_0
    iget-object v4, p2, Lm7/g;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 101
    .line 102
    if-nez v4, :cond_1

    .line 103
    .line 104
    const/4 v4, 0x1

    .line 105
    goto :goto_1

    .line 106
    :cond_1
    const/4 v4, 0x0

    .line 107
    :goto_1
    if-eq v3, v4, :cond_2

    .line 108
    .line 109
    if-nez v0, :cond_3

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_2
    iget-boolean v0, p1, Lm7/g;->a:Z

    .line 113
    .line 114
    iget-boolean v3, p2, Lm7/g;->a:Z

    .line 115
    .line 116
    if-eq v0, v3, :cond_5

    .line 117
    .line 118
    if-eqz v0, :cond_4

    .line 119
    .line 120
    :cond_3
    const/4 v1, -0x1

    .line 121
    goto :goto_3

    .line 122
    :cond_4
    :goto_2
    const/4 v1, 0x1

    .line 123
    goto :goto_3

    .line 124
    :cond_5
    iget v0, p2, Lm7/g;->b:I

    .line 125
    .line 126
    iget v2, p1, Lm7/g;->b:I

    .line 127
    .line 128
    sub-int/2addr v0, v2

    .line 129
    if-eqz v0, :cond_6

    .line 130
    .line 131
    move v1, v0

    .line 132
    goto :goto_3

    .line 133
    :cond_6
    iget p1, p1, Lm7/g;->c:I

    .line 134
    .line 135
    iget p2, p2, Lm7/g;->c:I

    .line 136
    .line 137
    sub-int/2addr p1, p2

    .line 138
    if-eqz p1, :cond_7

    .line 139
    .line 140
    move v1, p1

    .line 141
    :cond_7
    :goto_3
    return v1

    .line 142
    :pswitch_5
    check-cast p1, Ljava/lang/Comparable;

    .line 143
    .line 144
    check-cast p2, Ljava/lang/Comparable;

    .line 145
    .line 146
    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    return p1

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method
