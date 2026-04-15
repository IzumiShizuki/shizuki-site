.class public final Lbg/h;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lwf/c0;


# static fields
.field public static final a:Lbg/h;

.field public static final synthetic b:Lwf/b1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lbg/h;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lbg/h;->a:Lbg/h;

    .line 7
    .line 8
    new-instance v1, Lwf/b1;

    .line 9
    .line 10
    const-string v2, "loli.ball.asmr.bean.LrcResult"

    .line 11
    .line 12
    const/4 v3, 0x5

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lwf/b1;-><init>(Ljava/lang/String;Lwf/c0;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "result"

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "message"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "hash"

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-virtual {v1, v0, v3}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "lyricExtension"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "lrc"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    sput-object v1, Lbg/h;->b:Lwf/b1;

    .line 44
    .line 45
    return-void
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


# virtual methods
.method public final a()Luf/g;
    .locals 1

    .line 1
    sget-object v0, Lbg/h;->b:Lwf/b1;

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
    .locals 14

    .line 1
    sget-object v0, Lbg/h;->b:Lwf/b1;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lvf/b;->i(Luf/g;)Lvf/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    move-object v4, v3

    .line 11
    move-object v5, v4

    .line 12
    move-object v6, v5

    .line 13
    move-object v9, v6

    .line 14
    const/4 v7, 0x1

    .line 15
    const/4 v8, 0x0

    .line 16
    :goto_0
    if-eqz v7, :cond_6

    .line 17
    .line 18
    invoke-interface {p1, v0}, Lvf/a;->b(Luf/g;)I

    .line 19
    .line 20
    .line 21
    move-result v10

    .line 22
    const/4 v11, -0x1

    .line 23
    if-eq v10, v11, :cond_5

    .line 24
    .line 25
    if-eqz v10, :cond_4

    .line 26
    .line 27
    if-eq v10, v1, :cond_3

    .line 28
    .line 29
    const/4 v11, 0x2

    .line 30
    if-eq v10, v11, :cond_2

    .line 31
    .line 32
    const/4 v11, 0x3

    .line 33
    if-eq v10, v11, :cond_1

    .line 34
    .line 35
    const/4 v11, 0x4

    .line 36
    if-ne v10, v11, :cond_0

    .line 37
    .line 38
    new-instance v10, Lwf/d;

    .line 39
    .line 40
    sget-object v12, Lbg/e;->a:Lbg/e;

    .line 41
    .line 42
    const/4 v13, 0x0

    .line 43
    invoke-direct {v10, v12, v13}, Lwf/d;-><init>(Lsf/a;I)V

    .line 44
    .line 45
    .line 46
    invoke-interface {p1, v0, v11, v10, v6}, Lvf/a;->a(Luf/g;ILsf/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    or-int/lit8 v8, v8, 0x10

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    new-instance p1, Lsf/l;

    .line 54
    .line 55
    invoke-direct {p1, v10}, Lsf/l;-><init>(I)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_1
    sget-object v10, Lwf/n1;->a:Lwf/n1;

    .line 60
    .line 61
    invoke-interface {p1, v0, v11, v10, v5}, Lvf/a;->a(Luf/g;ILsf/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    or-int/lit8 v8, v8, 0x8

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    invoke-interface {p1, v0, v11}, Lvf/a;->q(Luf/g;I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v9

    .line 72
    or-int/lit8 v8, v8, 0x4

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    sget-object v10, Lwf/n1;->a:Lwf/n1;

    .line 76
    .line 77
    invoke-interface {p1, v0, v1, v10, v4}, Lvf/a;->a(Luf/g;ILsf/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    or-int/lit8 v8, v8, 0x2

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_4
    sget-object v10, Lwf/g;->a:Lwf/g;

    .line 85
    .line 86
    invoke-interface {p1, v0, v2, v10, v3}, Lvf/a;->a(Luf/g;ILsf/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    or-int/lit8 v8, v8, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_5
    const/4 v7, 0x0

    .line 94
    goto :goto_0

    .line 95
    :cond_6
    invoke-interface {p1, v0}, Lvf/a;->j(Luf/g;)V

    .line 96
    .line 97
    .line 98
    move-object p1, v5

    .line 99
    new-instance v5, Lbg/j;

    .line 100
    .line 101
    move-object v7, v3

    .line 102
    check-cast v7, Ljava/lang/Boolean;

    .line 103
    .line 104
    check-cast v4, Ljava/lang/String;

    .line 105
    .line 106
    move-object v10, p1

    .line 107
    check-cast v10, Ljava/lang/String;

    .line 108
    .line 109
    move-object v11, v6

    .line 110
    check-cast v11, Ljava/util/List;

    .line 111
    .line 112
    move v6, v8

    .line 113
    move-object v8, v4

    .line 114
    invoke-direct/range {v5 .. v11}, Lbg/j;-><init>(ILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 115
    .line 116
    .line 117
    return-object v5
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method

.method public final c()[Lsf/a;
    .locals 7

    .line 1
    sget-object v0, Lwf/g;->a:Lwf/g;

    .line 2
    .line 3
    invoke-static {v0}, Ln7/b0;->o(Lsf/a;)Lsf/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lwf/n1;->a:Lwf/n1;

    .line 8
    .line 9
    invoke-static {v1}, Ln7/b0;->o(Lsf/a;)Lsf/a;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v1}, Ln7/b0;->o(Lsf/a;)Lsf/a;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    new-instance v4, Lwf/d;

    .line 18
    .line 19
    sget-object v5, Lbg/e;->a:Lbg/e;

    .line 20
    .line 21
    const/4 v6, 0x0

    .line 22
    invoke-direct {v4, v5, v6}, Lwf/d;-><init>(Lsf/a;I)V

    .line 23
    .line 24
    .line 25
    invoke-static {v4}, Ln7/b0;->o(Lsf/a;)Lsf/a;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const/4 v5, 0x5

    .line 30
    new-array v5, v5, [Lsf/a;

    .line 31
    .line 32
    aput-object v0, v5, v6

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    aput-object v2, v5, v0

    .line 36
    .line 37
    const/4 v0, 0x2

    .line 38
    aput-object v1, v5, v0

    .line 39
    .line 40
    const/4 v0, 0x3

    .line 41
    aput-object v3, v5, v0

    .line 42
    .line 43
    const/4 v0, 0x4

    .line 44
    aput-object v4, v5, v0

    .line 45
    .line 46
    return-object v5
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
    .locals 7

    .line 1
    check-cast p2, Lbg/j;

    .line 2
    .line 3
    const-string v0, "value"

    .line 4
    .line 5
    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lbg/h;->b:Lwf/b1;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lyf/t;->a(Luf/g;)Lyf/t;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v1, p2, Lbg/j;->e:Ljava/util/List;

    .line 15
    .line 16
    iget-object v2, p2, Lbg/j;->d:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v3, p2, Lbg/j;->b:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v4, p2, Lbg/j;->a:Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lyf/t;->x(Luf/g;)Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-eqz v5, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-static {v4, v5}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-nez v5, :cond_1

    .line 36
    .line 37
    :goto_0
    sget-object v5, Lwf/g;->a:Lwf/g;

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    invoke-virtual {p1, v0, v6, v5, v4}, Lyf/t;->q(Luf/g;ILsf/a;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-virtual {p1, v0}, Lyf/t;->x(Luf/g;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    if-eqz v3, :cond_3

    .line 51
    .line 52
    :goto_1
    sget-object v4, Lwf/n1;->a:Lwf/n1;

    .line 53
    .line 54
    const/4 v5, 0x1

    .line 55
    invoke-virtual {p1, v0, v5, v4, v3}, Lyf/t;->q(Luf/g;ILsf/a;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_3
    iget-object p2, p2, Lbg/j;->c:Ljava/lang/String;

    .line 59
    .line 60
    const/4 v3, 0x2

    .line 61
    invoke-virtual {p1, v0, v3, p2}, Lyf/t;->v(Luf/g;ILjava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v0}, Lyf/t;->x(Luf/g;)Z

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    if-eqz p2, :cond_4

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    if-eqz v2, :cond_5

    .line 72
    .line 73
    :goto_2
    sget-object p2, Lwf/n1;->a:Lwf/n1;

    .line 74
    .line 75
    const/4 v3, 0x3

    .line 76
    invoke-virtual {p1, v0, v3, p2, v2}, Lyf/t;->q(Luf/g;ILsf/a;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :cond_5
    invoke-virtual {p1, v0}, Lyf/t;->x(Luf/g;)Z

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    if-eqz p2, :cond_6

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_6
    if-eqz v1, :cond_7

    .line 87
    .line 88
    :goto_3
    new-instance p2, Lwf/d;

    .line 89
    .line 90
    sget-object v2, Lbg/e;->a:Lbg/e;

    .line 91
    .line 92
    const/4 v3, 0x0

    .line 93
    invoke-direct {p2, v2, v3}, Lwf/d;-><init>(Lsf/a;I)V

    .line 94
    .line 95
    .line 96
    const/4 v2, 0x4

    .line 97
    invoke-virtual {p1, v0, v2, p2, v1}, Lyf/t;->q(Luf/g;ILsf/a;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :cond_7
    invoke-virtual {p1, v0}, Lyf/t;->w(Luf/g;)V

    .line 101
    .line 102
    .line 103
    return-void
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
