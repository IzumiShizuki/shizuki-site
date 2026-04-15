.class public final Lbg/q0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lwf/c0;


# static fields
.field public static final a:Lbg/q0;

.field public static final synthetic b:Lwf/b1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lbg/q0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lbg/q0;->a:Lbg/q0;

    .line 7
    .line 8
    new-instance v1, Lwf/b1;

    .line 9
    .line 10
    const-string v2, "loli.ball.asmr.bean.Subtitle"

    .line 11
    .line 12
    const/4 v3, 0x6

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lwf/b1;-><init>(Ljava/lang/String;Lwf/c0;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "title"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "subPath"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "hash"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "ext"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string v0, "duration"

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    const-string v0, "confidence"

    .line 43
    .line 44
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 45
    .line 46
    .line 47
    sput-object v1, Lbg/q0;->b:Lwf/b1;

    .line 48
    .line 49
    return-void
    .line 50
    .line 51
    .line 52
    .line 53
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


# virtual methods
.method public final a()Luf/g;
    .locals 1

    .line 1
    sget-object v0, Lbg/q0;->b:Lwf/b1;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final b(Lvf/b;)Ljava/lang/Object;
    .locals 17

    .line 1
    sget-object v0, Lbg/q0;->b:Lwf/b1;

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-interface {v1, v0}, Lvf/b;->i(Luf/g;)Lvf/a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    const-wide/16 v6, 0x0

    .line 14
    .line 15
    move-object v10, v4

    .line 16
    move-object v12, v10

    .line 17
    move-object v13, v12

    .line 18
    move-wide v15, v6

    .line 19
    const/4 v5, 0x1

    .line 20
    const/4 v9, 0x0

    .line 21
    const/4 v14, 0x0

    .line 22
    :goto_0
    if-eqz v5, :cond_0

    .line 23
    .line 24
    invoke-interface {v1, v0}, Lvf/a;->b(Luf/g;)I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    packed-switch v6, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    new-instance v0, Lsf/l;

    .line 32
    .line 33
    invoke-direct {v0, v6}, Lsf/l;-><init>(I)V

    .line 34
    .line 35
    .line 36
    throw v0

    .line 37
    :pswitch_0
    const/4 v6, 0x5

    .line 38
    invoke-interface {v1, v0, v6}, Lvf/a;->c(Luf/g;I)D

    .line 39
    .line 40
    .line 41
    move-result-wide v15

    .line 42
    or-int/lit8 v9, v9, 0x20

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :pswitch_1
    const/4 v6, 0x4

    .line 46
    invoke-interface {v1, v0, v6}, Lvf/a;->C(Luf/g;I)F

    .line 47
    .line 48
    .line 49
    move-result v14

    .line 50
    or-int/lit8 v9, v9, 0x10

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :pswitch_2
    const/4 v6, 0x3

    .line 54
    invoke-interface {v1, v0, v6}, Lvf/a;->q(Luf/g;I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v13

    .line 58
    or-int/lit8 v9, v9, 0x8

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :pswitch_3
    const/4 v6, 0x2

    .line 62
    invoke-interface {v1, v0, v6}, Lvf/a;->q(Luf/g;I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v12

    .line 66
    or-int/lit8 v9, v9, 0x4

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :pswitch_4
    new-instance v6, Lwf/d;

    .line 70
    .line 71
    sget-object v7, Lwf/n1;->a:Lwf/n1;

    .line 72
    .line 73
    const/4 v8, 0x0

    .line 74
    invoke-direct {v6, v7, v8}, Lwf/d;-><init>(Lsf/a;I)V

    .line 75
    .line 76
    .line 77
    invoke-interface {v1, v0, v2, v6, v4}, Lvf/a;->g(Luf/g;ILsf/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    or-int/lit8 v9, v9, 0x2

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :pswitch_5
    invoke-interface {v1, v0, v3}, Lvf/a;->q(Luf/g;I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    or-int/lit8 v9, v9, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :pswitch_6
    const/4 v5, 0x0

    .line 92
    goto :goto_0

    .line 93
    :cond_0
    invoke-interface {v1, v0}, Lvf/a;->j(Luf/g;)V

    .line 94
    .line 95
    .line 96
    new-instance v8, Lbg/s0;

    .line 97
    .line 98
    move-object v11, v4

    .line 99
    check-cast v11, Ljava/util/List;

    .line 100
    .line 101
    invoke-direct/range {v8 .. v16}, Lbg/s0;-><init>(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;FD)V

    .line 102
    .line 103
    .line 104
    return-object v8

    .line 105
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c()[Lsf/a;
    .locals 4

    .line 1
    sget-object v0, Lwf/n1;->a:Lwf/n1;

    .line 2
    .line 3
    new-instance v1, Lwf/d;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, v0, v2}, Lwf/d;-><init>(Lsf/a;I)V

    .line 7
    .line 8
    .line 9
    const/4 v3, 0x6

    .line 10
    new-array v3, v3, [Lsf/a;

    .line 11
    .line 12
    aput-object v0, v3, v2

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    aput-object v1, v3, v2

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    aput-object v0, v3, v1

    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    aput-object v0, v3, v1

    .line 22
    .line 23
    sget-object v0, Lwf/b0;->a:Lwf/b0;

    .line 24
    .line 25
    const/4 v1, 0x4

    .line 26
    aput-object v0, v3, v1

    .line 27
    .line 28
    sget-object v0, Lwf/u;->a:Lwf/u;

    .line 29
    .line 30
    const/4 v1, 0x5

    .line 31
    aput-object v0, v3, v1

    .line 32
    .line 33
    return-object v3
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
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

.method public final d(Lyf/t;Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p2, Lbg/s0;

    .line 2
    .line 3
    const-string v0, "value"

    .line 4
    .line 5
    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lbg/q0;->b:Lwf/b1;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lyf/t;->a(Luf/g;)Lyf/t;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v1, p2, Lbg/s0;->a:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {p1, v0, v2, v1}, Lyf/t;->v(Luf/g;ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lwf/d;

    .line 21
    .line 22
    sget-object v2, Lwf/n1;->a:Lwf/n1;

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-direct {v1, v2, v3}, Lwf/d;-><init>(Lsf/a;I)V

    .line 26
    .line 27
    .line 28
    iget-object v2, p2, Lbg/s0;->b:Ljava/util/List;

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    invoke-virtual {p1, v0, v3, v1, v2}, Lyf/t;->r(Luf/g;ILsf/a;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    const/4 v1, 0x2

    .line 35
    iget-object v2, p2, Lbg/s0;->c:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {p1, v0, v1, v2}, Lyf/t;->v(Luf/g;ILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x3

    .line 41
    iget-object v2, p2, Lbg/s0;->d:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {p1, v0, v1, v2}, Lyf/t;->v(Luf/g;ILjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x4

    .line 47
    iget v2, p2, Lbg/s0;->e:F

    .line 48
    .line 49
    invoke-virtual {p1, v0, v1, v2}, Lyf/t;->i(Luf/g;IF)V

    .line 50
    .line 51
    .line 52
    iget-wide v1, p2, Lbg/s0;->f:D

    .line 53
    .line 54
    const/4 p2, 0x5

    .line 55
    invoke-virtual {p1, v0, p2}, Lyf/t;->g(Luf/g;I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v1, v2}, Lyf/t;->f(D)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v0}, Lyf/t;->w(Luf/g;)V

    .line 62
    .line 63
    .line 64
    return-void
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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
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
