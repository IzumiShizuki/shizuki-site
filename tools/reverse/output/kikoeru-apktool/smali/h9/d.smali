.class public abstract Lh9/d;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Lx0/e1;

.field public static final b:Lx0/e1;

.field public static final c:Lh1/s;

.field public static final d:Lx0/e1;

.field public static final e:Lx0/e1;

.field public static final f:Lub/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    sput-object v1, Lh9/d;->a:Lx0/e1;

    .line 7
    .line 8
    invoke-static {v0}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lh9/d;->b:Lx0/e1;

    .line 13
    .line 14
    new-instance v0, Lh1/s;

    .line 15
    .line 16
    invoke-direct {v0}, Lh1/s;-><init>()V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lh9/d;->c:Lh1/s;

    .line 20
    .line 21
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-static {v0}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Lh9/d;->d:Lx0/e1;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lh9/d;->e:Lx0/e1;

    .line 39
    .line 40
    new-instance v0, Le/e;

    .line 41
    .line 42
    const/16 v1, 0x17

    .line 43
    .line 44
    invoke-direct {v0, v1}, Le/e;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, Lh9/d;->f:Lub/p;

    .line 52
    .line 53
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
.end method

.method public static a(Ljava/util/List;Landroid/net/Uri;)Ljava/util/ArrayList;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "musicList"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, Ljava/lang/Iterable;

    .line 9
    .line 10
    new-instance v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    const/16 v2, 0xa

    .line 13
    .line 14
    invoke-static {v0, v2}, Lvb/n;->K(Ljava/lang/Iterable;I)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_5

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lbg/z;

    .line 36
    .line 37
    iget-object v3, v2, Lbg/z;->d:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v4, v2, Lbg/z;->f:Ljava/lang/String;

    .line 40
    .line 41
    new-instance v5, Lm4/k0;

    .line 42
    .line 43
    invoke-direct {v5}, Lm4/k0;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object v3, v5, Lm4/k0;->a:Ljava/lang/CharSequence;

    .line 47
    .line 48
    iput-object v3, v5, Lm4/k0;->c:Ljava/lang/CharSequence;

    .line 49
    .line 50
    iput-object v3, v5, Lm4/k0;->e:Ljava/lang/CharSequence;

    .line 51
    .line 52
    iput-object v4, v5, Lm4/k0;->b:Ljava/lang/CharSequence;

    .line 53
    .line 54
    iput-object v4, v5, Lm4/k0;->d:Ljava/lang/CharSequence;

    .line 55
    .line 56
    iput-object v4, v5, Lm4/k0;->f:Ljava/lang/CharSequence;

    .line 57
    .line 58
    move-object/from16 v3, p1

    .line 59
    .line 60
    iput-object v3, v5, Lm4/k0;->m:Landroid/net/Uri;

    .line 61
    .line 62
    new-instance v11, Lm4/l0;

    .line 63
    .line 64
    invoke-direct {v11, v5}, Lm4/l0;-><init>(Lm4/k0;)V

    .line 65
    .line 66
    .line 67
    new-instance v4, Lm4/w;

    .line 68
    .line 69
    invoke-direct {v4}, Lm4/w;-><init>()V

    .line 70
    .line 71
    .line 72
    new-instance v5, Lm4/z;

    .line 73
    .line 74
    invoke-direct {v5}, Lm4/z;-><init>()V

    .line 75
    .line 76
    .line 77
    sget-object v17, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 78
    .line 79
    sget-object v19, Lya/a1;->e:Lya/a1;

    .line 80
    .line 81
    new-instance v6, Lm4/b0;

    .line 82
    .line 83
    invoke-direct {v6}, Lm4/b0;-><init>()V

    .line 84
    .line 85
    .line 86
    sget-object v7, Lm4/e0;->d:Lm4/e0;

    .line 87
    .line 88
    invoke-virtual {v2}, Lbg/k0;->d()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    const/4 v9, 0x0

    .line 93
    if-nez v8, :cond_0

    .line 94
    .line 95
    move-object v13, v9

    .line 96
    goto :goto_1

    .line 97
    :cond_0
    invoke-static {v8}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    move-object v13, v8

    .line 102
    :goto_1
    invoke-virtual {v2}, Lbg/k0;->d()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    iget-object v8, v5, Lm4/z;->e:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v8, Landroid/net/Uri;

    .line 112
    .line 113
    if-eqz v8, :cond_2

    .line 114
    .line 115
    iget-object v8, v5, Lm4/z;->d:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v8, Ljava/util/UUID;

    .line 118
    .line 119
    if-eqz v8, :cond_1

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_1
    const/4 v8, 0x0

    .line 123
    goto :goto_3

    .line 124
    :cond_2
    :goto_2
    const/4 v8, 0x1

    .line 125
    :goto_3
    invoke-static {v8}, Lp4/c;->i(Z)V

    .line 126
    .line 127
    .line 128
    if-eqz v13, :cond_4

    .line 129
    .line 130
    new-instance v12, Lm4/d0;

    .line 131
    .line 132
    iget-object v8, v5, Lm4/z;->d:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v8, Ljava/util/UUID;

    .line 135
    .line 136
    if-eqz v8, :cond_3

    .line 137
    .line 138
    new-instance v9, Lm4/a0;

    .line 139
    .line 140
    invoke-direct {v9, v5}, Lm4/a0;-><init>(Lm4/z;)V

    .line 141
    .line 142
    .line 143
    :cond_3
    move-object v15, v9

    .line 144
    const/4 v14, 0x0

    .line 145
    const/16 v16, 0x0

    .line 146
    .line 147
    const/16 v18, 0x0

    .line 148
    .line 149
    const-wide v20, -0x7fffffffffffffffL    # -4.9E-324

    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    invoke-direct/range {v12 .. v21}, Lm4/d0;-><init>(Landroid/net/Uri;Ljava/lang/String;Lm4/a0;Lm4/v;Ljava/util/List;Ljava/lang/String;Lya/i0;J)V

    .line 155
    .line 156
    .line 157
    move-object v9, v12

    .line 158
    :cond_4
    new-instance v5, Lm4/i0;

    .line 159
    .line 160
    new-instance v8, Lm4/y;

    .line 161
    .line 162
    invoke-direct {v8, v4}, Lm4/x;-><init>(Lm4/w;)V

    .line 163
    .line 164
    .line 165
    new-instance v10, Lm4/c0;

    .line 166
    .line 167
    invoke-direct {v10, v6}, Lm4/c0;-><init>(Lm4/b0;)V

    .line 168
    .line 169
    .line 170
    move-object v6, v5

    .line 171
    move-object v12, v7

    .line 172
    move-object v7, v2

    .line 173
    invoke-direct/range {v6 .. v12}, Lm4/i0;-><init>(Ljava/lang/String;Lm4/y;Lm4/d0;Lm4/c0;Lm4/l0;Lm4/e0;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    goto/16 :goto_0

    .line 180
    .line 181
    :cond_5
    return-object v1
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

.method public static b()Lbg/z;
    .locals 2

    .line 1
    sget-object v0, Lh9/d;->b:Lx0/e1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Integer;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sget-object v1, Lh9/d;->c:Lh1/s;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lvb/m;->b0(ILjava/util/List;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lbg/z;

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return-object v0
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static c()Landroidx/media3/exoplayer/ExoPlayer;
    .locals 1

    .line 1
    sget-object v0, Lh9/d;->f:Lub/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lub/p;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/media3/exoplayer/ExoPlayer;

    .line 8
    .line 9
    return-object v0
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
.end method

.method public static d()Ljava/lang/Long;
    .locals 2

    .line 1
    sget-object v0, Lh9/d;->a:Lx0/e1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lbg/a2;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-wide v0, v0, Lbg/a2;->f:J

    .line 12
    .line 13
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return-object v0
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
.end method

.method public static e(I)V
    .locals 4

    .line 1
    sget-object v0, Lh9/d;->b:Lx0/e1;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lh9/d;->c()Landroidx/media3/exoplayer/ExoPlayer;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lv4/v;

    .line 15
    .line 16
    invoke-virtual {v0}, Lv4/v;->g2()V

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lh9/d;->c()Landroidx/media3/exoplayer/ExoPlayer;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sget-object v1, Lh9/d;->a:Lx0/e1;

    .line 24
    .line 25
    invoke-virtual {v1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lbg/a2;

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    iget-object v1, v1, Lbg/a2;->I:Ljava/lang/String;

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v1, 0x0

    .line 43
    :goto_0
    sget-object v2, Lh9/d;->c:Lh1/s;

    .line 44
    .line 45
    invoke-static {v2, v1}, Lh9/d;->a(Ljava/util/List;Landroid/net/Uri;)Ljava/util/ArrayList;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v0, Landroidx/lifecycle/q;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    check-cast v0, Lv4/v;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Lv4/v;->A0(Ljava/util/List;)V

    .line 57
    .line 58
    .line 59
    invoke-static {}, Lh9/d;->c()Landroidx/media3/exoplayer/ExoPlayer;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Lv4/v;

    .line 64
    .line 65
    invoke-virtual {v0}, Lv4/v;->c()V

    .line 66
    .line 67
    .line 68
    invoke-static {}, Lh9/d;->c()Landroidx/media3/exoplayer/ExoPlayer;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Landroidx/lifecycle/q;

    .line 73
    .line 74
    const/4 v1, 0x0

    .line 75
    const-wide/16 v2, 0x0

    .line 76
    .line 77
    invoke-virtual {v0, p0, v1, v2, v3}, Landroidx/lifecycle/q;->r1(IZJ)V

    .line 78
    .line 79
    .line 80
    const/4 p0, 0x1

    .line 81
    invoke-static {p0}, Lh9/d;->f(Z)V

    .line 82
    .line 83
    .line 84
    return-void
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public static f(Z)V
    .locals 1

    .line 1
    invoke-static {}, Lh9/d;->c()Landroidx/media3/exoplayer/ExoPlayer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroidx/lifecycle/q;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/lifecycle/q;->o1()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eq v0, p0, :cond_1

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lh9/d;->c()Landroidx/media3/exoplayer/ExoPlayer;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Landroidx/lifecycle/q;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/lifecycle/q;->k()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-static {}, Lh9/d;->c()Landroidx/media3/exoplayer/ExoPlayer;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Landroidx/lifecycle/q;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroidx/lifecycle/q;->p1()V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
    .line 35
    .line 36
.end method

.method public static g()Lh9/b;
    .locals 9

    .line 1
    invoke-static {}, Lh9/d;->d()Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lh9/d;->b()Lbg/z;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v1, v1, Lbg/z;->d:Ljava/lang/String;

    .line 13
    .line 14
    move-object v5, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v5, v2

    .line 17
    :goto_0
    sget-object v1, Lh9/d;->a:Lx0/e1;

    .line 18
    .line 19
    invoke-virtual {v1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lbg/a2;

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-static {v1}, Lna/c;->l(Lbg/a2;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    move-object v4, v1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move-object v4, v2

    .line 34
    :goto_1
    if-eqz v0, :cond_2

    .line 35
    .line 36
    if-eqz v5, :cond_2

    .line 37
    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    new-instance v3, Lh9/b;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 43
    .line 44
    .line 45
    move-result-wide v7

    .line 46
    invoke-static {v5}, Lna/w;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-direct/range {v3 .. v8}, Lh9/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 51
    .line 52
    .line 53
    return-object v3

    .line 54
    :cond_2
    return-object v2
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
.end method

.method public static h(Lac/i;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Lhf/l0;->a:Lpf/e;

    .line 2
    .line 3
    sget-object v0, Lpf/d;->c:Lpf/d;

    .line 4
    .line 5
    new-instance v1, Lh9/c;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v1, v2, v4, v3}, Lh9/c;-><init>(ILyb/c;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, p0}, Lhf/a0;->H(Lyb/h;Lic/n;Lyb/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
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
