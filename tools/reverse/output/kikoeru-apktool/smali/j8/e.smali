.class public final Lj8/e;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Lj8/n;

.field public final b:Ls8/m;

.field public final c:Lrf/e;

.field public final d:Lj8/j;


# direct methods
.method public constructor <init>(Lj8/n;Ls8/m;Lrf/e;Lj8/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj8/e;->a:Lj8/n;

    .line 5
    .line 6
    iput-object p2, p0, Lj8/e;->b:Ls8/m;

    .line 7
    .line 8
    iput-object p3, p0, Lj8/e;->c:Lrf/e;

    .line 9
    .line 10
    iput-object p4, p0, Lj8/e;->d:Lj8/j;

    .line 11
    .line 12
    return-void
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
.end method


# virtual methods
.method public final a(Lac/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p1, Lj8/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lj8/d;

    .line 7
    .line 8
    iget v1, v0, Lj8/d;->h:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lj8/d;->h:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lj8/d;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lj8/d;-><init>(Lj8/e;Lac/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lj8/d;->f:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lj8/d;->h:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    sget-object v4, Lzb/a;->a:Lzb/a;

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    if-eq v1, v3, :cond_2

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    iget-object v0, v0, Lj8/d;->d:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Lrf/e;

    .line 42
    .line 43
    :try_start_0
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    goto :goto_3

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_5

    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_2
    iget-object v1, v0, Lj8/d;->e:Lrf/e;

    .line 58
    .line 59
    iget-object v3, v0, Lj8/d;->d:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v3, Lj8/e;

    .line 62
    .line 63
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    move-object p1, v1

    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iput-object p0, v0, Lj8/d;->d:Ljava/lang/Object;

    .line 72
    .line 73
    iget-object p1, p0, Lj8/e;->c:Lrf/e;

    .line 74
    .line 75
    iput-object p1, v0, Lj8/d;->e:Lrf/e;

    .line 76
    .line 77
    iput v3, v0, Lj8/d;->h:I

    .line 78
    .line 79
    move-object v1, p1

    .line 80
    check-cast v1, Lrf/h;

    .line 81
    .line 82
    invoke-virtual {v1, v0}, Lrf/h;->a(Lac/c;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    if-ne v1, v4, :cond_4

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_4
    move-object v3, p0

    .line 90
    :goto_1
    :try_start_1
    new-instance v1, Landroidx/lifecycle/n0;

    .line 91
    .line 92
    const/16 v5, 0xf

    .line 93
    .line 94
    invoke-direct {v1, v5, v3}, Landroidx/lifecycle/n0;-><init>(ILjava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    iput-object p1, v0, Lj8/d;->d:Ljava/lang/Object;

    .line 98
    .line 99
    const/4 v3, 0x0

    .line 100
    iput-object v3, v0, Lj8/d;->e:Lrf/e;

    .line 101
    .line 102
    iput v2, v0, Lj8/d;->h:I

    .line 103
    .line 104
    sget-object v2, Lyb/i;->a:Lyb/i;

    .line 105
    .line 106
    new-instance v5, Landroidx/lifecycle/r;

    .line 107
    .line 108
    const/4 v6, 0x5

    .line 109
    invoke-direct {v5, v6, v1, v3}, Landroidx/lifecycle/r;-><init>(ILjava/lang/Object;Lyb/c;)V

    .line 110
    .line 111
    .line 112
    invoke-static {v2, v5, v0}, Lhf/a0;->H(Lyb/h;Lic/n;Lyb/c;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 116
    if-ne v0, v4, :cond_5

    .line 117
    .line 118
    :goto_2
    return-object v4

    .line 119
    :cond_5
    move-object v7, v0

    .line 120
    move-object v0, p1

    .line 121
    move-object p1, v7

    .line 122
    :goto_3
    :try_start_2
    check-cast p1, Lj8/g;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 123
    .line 124
    check-cast v0, Lrf/h;

    .line 125
    .line 126
    invoke-virtual {v0}, Lrf/h;->d()V

    .line 127
    .line 128
    .line 129
    return-object p1

    .line 130
    :goto_4
    move-object v7, v0

    .line 131
    move-object v0, p1

    .line 132
    move-object p1, v7

    .line 133
    goto :goto_5

    .line 134
    :catchall_1
    move-exception v0

    .line 135
    goto :goto_4

    .line 136
    :goto_5
    check-cast v0, Lrf/h;

    .line 137
    .line 138
    invoke-virtual {v0}, Lrf/h;->d()V

    .line 139
    .line 140
    .line 141
    throw p1
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
