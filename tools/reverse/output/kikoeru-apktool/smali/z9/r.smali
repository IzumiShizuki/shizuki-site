.class public final Lz9/r;
.super Landroidx/lifecycle/s0;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final b:Lx0/e1;

.field public final c:Lx0/e1;

.field public final d:Lx0/e1;

.field public final e:Lx0/e1;

.field public final f:Lx0/e1;

.field public final g:Lx0/e1;

.field public final h:Lx0/e1;

.field public final i:Lx0/e1;

.field public j:Z

.field public final k:Lx0/e1;

.field public final l:Llf/k0;

.field public final m:Lx0/e1;

.field public final n:Lx0/e1;


# direct methods
.method public constructor <init>()V
    .locals 12

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/s0;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 5
    .line 6
    invoke-static {v0}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iput-object v1, p0, Lz9/r;->b:Lx0/e1;

    .line 11
    .line 12
    invoke-static {v0}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, p0, Lz9/r;->c:Lx0/e1;

    .line 17
    .line 18
    invoke-static {v0}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iput-object v1, p0, Lz9/r;->d:Lx0/e1;

    .line 23
    .line 24
    new-instance v1, Lp1/b;

    .line 25
    .line 26
    const-wide/16 v2, 0x0

    .line 27
    .line 28
    invoke-direct {v1, v2, v3}, Lp1/b;-><init>(J)V

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iput-object v1, p0, Lz9/r;->e:Lx0/e1;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-static {v1}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iput-object v1, p0, Lz9/r;->f:Lx0/e1;

    .line 43
    .line 44
    invoke-static {v0}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iput-object v1, p0, Lz9/r;->g:Lx0/e1;

    .line 49
    .line 50
    sget-object v1, Lef/a;->a:Ljava/nio/charset/Charset;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v1}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iput-object v1, p0, Lz9/r;->h:Lx0/e1;

    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    new-array v1, v1, [B

    .line 64
    .line 65
    invoke-static {v1}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iput-object v1, p0, Lz9/r;->i:Lx0/e1;

    .line 70
    .line 71
    invoke-static {v0}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, Lz9/r;->k:Lx0/e1;

    .line 76
    .line 77
    invoke-static {}, La9/i;->c()Lcom/cnl/kikoeru/data/db/AppDatabase;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, Lcom/cnl/kikoeru/data/db/AppDatabase;->u()Ld9/s;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iget-object v0, v0, Ld9/s;->a:Ln7/v;

    .line 86
    .line 87
    const-string v1, "LyricBean"

    .line 88
    .line 89
    filled-new-array {v1}, [Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    new-instance v4, Ld9/i;

    .line 94
    .line 95
    const/4 v5, 0x6

    .line 96
    invoke-direct {v4, v5}, Ld9/i;-><init>(I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Ln7/v;->f()Ln7/k;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    const/4 v6, 0x1

    .line 104
    invoke-static {v1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    check-cast v1, [Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {v5, v1, v6}, Ln7/k;->a([Ljava/lang/String;Z)Llf/f;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    const/4 v5, -0x1

    .line 115
    invoke-static {v1, v5}, Llf/p0;->g(Llf/f;I)Llf/f;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    new-instance v5, Li7/y1;

    .line 120
    .line 121
    const/4 v6, 0x2

    .line 122
    invoke-direct {v5, v1, v0, v4, v6}, Li7/y1;-><init>(Llf/f;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 123
    .line 124
    .line 125
    invoke-static {p0}, Landroidx/lifecycle/m0;->h(Landroidx/lifecycle/s0;)Lk4/a;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    new-instance v7, Llf/y0;

    .line 130
    .line 131
    const-wide/16 v8, 0x3e8

    .line 132
    .line 133
    invoke-direct {v7, v8, v9}, Llf/y0;-><init>(J)V

    .line 134
    .line 135
    .line 136
    invoke-static {v5}, Llf/p0;->i(Llf/f;)Lk9/c;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    sget-object v10, Lvb/r;->a:Lvb/r;

    .line 141
    .line 142
    invoke-static {v10}, Llf/p0;->c(Ljava/lang/Object;)Llf/b1;

    .line 143
    .line 144
    .line 145
    move-result-object v9

    .line 146
    iget-object v4, v1, Lk9/c;->e:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v4, Lyb/h;

    .line 149
    .line 150
    iget-object v1, v1, Lk9/c;->d:Ljava/lang/Object;

    .line 151
    .line 152
    move-object v8, v1

    .line 153
    check-cast v8, Llf/f;

    .line 154
    .line 155
    sget-object v1, Llf/s0;->a:Llf/u0;

    .line 156
    .line 157
    invoke-virtual {v7, v1}, Llf/y0;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-eqz v1, :cond_0

    .line 162
    .line 163
    sget-object v1, Lhf/z;->a:Lhf/z;

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_0
    sget-object v1, Lhf/z;->d:Lhf/z;

    .line 167
    .line 168
    :goto_0
    new-instance v6, Le/j;

    .line 169
    .line 170
    const/4 v11, 0x0

    .line 171
    invoke-direct/range {v6 .. v11}, Le/j;-><init>(Llf/t0;Llf/f;Llf/h0;Ljava/lang/Object;Lyb/c;)V

    .line 172
    .line 173
    .line 174
    invoke-static {v0, v4, v1, v6}, Lhf/a0;->x(Lhf/y;Lyb/h;Lhf/z;Lic/n;)Lhf/r1;

    .line 175
    .line 176
    .line 177
    new-instance v0, Llf/k0;

    .line 178
    .line 179
    invoke-direct {v0, v9}, Llf/k0;-><init>(Llf/b1;)V

    .line 180
    .line 181
    .line 182
    iput-object v0, p0, Lz9/r;->l:Llf/k0;

    .line 183
    .line 184
    invoke-static {v10}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    iput-object v0, p0, Lz9/r;->m:Lx0/e1;

    .line 189
    .line 190
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-static {v0}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    iput-object v0, p0, Lz9/r;->n:Lx0/e1;

    .line 199
    .line 200
    return-void
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
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
.end method


# virtual methods
.method public final A(Lac/c;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p1, Lz9/q;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lz9/q;

    .line 7
    .line 8
    iget v1, v0, Lz9/q;->f:I

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
    iput v1, v0, Lz9/q;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lz9/q;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lz9/q;-><init>(Lz9/r;Lac/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lz9/q;->d:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lz9/q;->f:I

    .line 28
    .line 29
    sget-object v2, Lub/a0;->a:Lub/a0;

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    sget-object v6, Lzb/a;->a:Lzb/a;

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v5, :cond_2

    .line 39
    .line 40
    if-eq v1, v4, :cond_2

    .line 41
    .line 42
    if-ne v1, v3, :cond_1

    .line 43
    .line 44
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-object v2

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_3
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, Lz9/r;->f:Lx0/e1;

    .line 64
    .line 65
    invoke-virtual {p1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Lc9/f;

    .line 70
    .line 71
    if-nez p1, :cond_4

    .line 72
    .line 73
    goto :goto_5

    .line 74
    :cond_4
    iget-boolean v1, p0, Lz9/r;->j:Z

    .line 75
    .line 76
    const/4 v7, 0x0

    .line 77
    const/4 v8, 0x0

    .line 78
    iget-object v9, p0, Lz9/r;->h:Lx0/e1;

    .line 79
    .line 80
    if-eqz v1, :cond_6

    .line 81
    .line 82
    invoke-static {}, La9/i;->c()Lcom/cnl/kikoeru/data/db/AppDatabase;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v1}, Lcom/cnl/kikoeru/data/db/AppDatabase;->u()Ld9/s;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v9}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    check-cast v4, Ljava/lang/String;

    .line 95
    .line 96
    const/16 v9, 0x3ef

    .line 97
    .line 98
    invoke-static {p1, v4, v8, v9}, Lc9/f;->a(Lc9/f;Ljava/lang/String;Ljava/lang/String;I)Lc9/f;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    iput v5, v0, Lz9/q;->f:I

    .line 103
    .line 104
    iget-object v4, v1, Ld9/s;->a:Ln7/v;

    .line 105
    .line 106
    new-instance v8, Ld9/r;

    .line 107
    .line 108
    const/4 v9, 0x1

    .line 109
    invoke-direct {v8, v1, p1, v9}, Ld9/r;-><init>(Ld9/s;Lc9/f;I)V

    .line 110
    .line 111
    .line 112
    invoke-static {v4, v7, v5, v8, v0}, Lua/l;->X(Ln7/v;ZZLic/k;Lyb/c;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    if-ne p1, v6, :cond_5

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_5
    move-object p1, v2

    .line 120
    :goto_1
    if-ne p1, v6, :cond_8

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_6
    invoke-static {}, La9/i;->c()Lcom/cnl/kikoeru/data/db/AppDatabase;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-virtual {v1}, Lcom/cnl/kikoeru/data/db/AppDatabase;->u()Ld9/s;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-virtual {v9}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v9

    .line 135
    check-cast v9, Ljava/lang/String;

    .line 136
    .line 137
    const/16 v10, 0x3bf

    .line 138
    .line 139
    invoke-static {p1, v8, v9, v10}, Lc9/f;->a(Lc9/f;Ljava/lang/String;Ljava/lang/String;I)Lc9/f;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    iput v4, v0, Lz9/q;->f:I

    .line 144
    .line 145
    iget-object v4, v1, Ld9/s;->a:Ln7/v;

    .line 146
    .line 147
    new-instance v8, Ld9/r;

    .line 148
    .line 149
    const/4 v9, 0x1

    .line 150
    invoke-direct {v8, v1, p1, v9}, Ld9/r;-><init>(Ld9/s;Lc9/f;I)V

    .line 151
    .line 152
    .line 153
    invoke-static {v4, v7, v5, v8, v0}, Lua/l;->X(Ln7/v;ZZLic/k;Lyb/c;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    if-ne p1, v6, :cond_7

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_7
    move-object p1, v2

    .line 161
    :goto_2
    if-ne p1, v6, :cond_8

    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_8
    :goto_3
    invoke-virtual {p0}, Lz9/r;->x()J

    .line 165
    .line 166
    .line 167
    move-result-wide v4

    .line 168
    iput v3, v0, Lz9/q;->f:I

    .line 169
    .line 170
    invoke-virtual {p0, v4, v5, v0}, Lz9/r;->z(JLac/c;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    if-ne p1, v6, :cond_9

    .line 175
    .line 176
    :goto_4
    return-object v6

    .line 177
    :cond_9
    :goto_5
    return-object v2
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

.method public final G(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz9/r;->g:Lx0/e1;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
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

.method public final H(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz9/r;->d:Lx0/e1;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
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

.method public final w(Lac/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p1, Lz9/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lz9/n;

    .line 7
    .line 8
    iget v1, v0, Lz9/n;->f:I

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
    iput v1, v0, Lz9/n;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lz9/n;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lz9/n;-><init>(Lz9/r;Lac/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lz9/n;->d:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lz9/n;->f:I

    .line 28
    .line 29
    iget-object v2, p0, Lz9/r;->f:Lx0/e1;

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    sget-object v4, Lub/a0;->a:Lub/a0;

    .line 33
    .line 34
    const/4 v5, 0x1

    .line 35
    sget-object v6, Lzb/a;->a:Lzb/a;

    .line 36
    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    if-eq v1, v5, :cond_2

    .line 40
    .line 41
    if-ne v1, v3, :cond_1

    .line 42
    .line 43
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_4

    .line 47
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_2
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Lc9/f;

    .line 67
    .line 68
    if-nez p1, :cond_4

    .line 69
    .line 70
    return-object v4

    .line 71
    :cond_4
    invoke-static {}, La9/i;->c()Lcom/cnl/kikoeru/data/db/AppDatabase;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v1}, Lcom/cnl/kikoeru/data/db/AppDatabase;->u()Ld9/s;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iput v5, v0, Lz9/n;->f:I

    .line 80
    .line 81
    iget-object v7, v1, Ld9/s;->a:Ln7/v;

    .line 82
    .line 83
    new-instance v8, Ld9/r;

    .line 84
    .line 85
    const/4 v9, 0x0

    .line 86
    invoke-direct {v8, v1, p1, v9}, Ld9/r;-><init>(Ld9/s;Lc9/f;I)V

    .line 87
    .line 88
    .line 89
    const/4 p1, 0x0

    .line 90
    invoke-static {v7, p1, v5, v8, v0}, Lua/l;->X(Ln7/v;ZZLic/k;Lyb/c;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    if-ne p1, v6, :cond_5

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_5
    move-object p1, v4

    .line 98
    :goto_1
    if-ne p1, v6, :cond_6

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_6
    :goto_2
    invoke-virtual {p0}, Lz9/r;->x()J

    .line 102
    .line 103
    .line 104
    move-result-wide v7

    .line 105
    iput v3, v0, Lz9/n;->f:I

    .line 106
    .line 107
    invoke-virtual {p0, v7, v8, v0}, Lz9/r;->z(JLac/c;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    if-ne p1, v6, :cond_7

    .line 112
    .line 113
    :goto_3
    return-object v6

    .line 114
    :cond_7
    :goto_4
    const/4 p1, 0x0

    .line 115
    invoke-virtual {v2, p1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    return-object v4
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

.method public final x()J
    .locals 2

    .line 1
    iget-object v0, p0, Lz9/r;->n:Lx0/e1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
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

.method public final z(JLac/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, Lz9/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lz9/p;

    .line 7
    .line 8
    iget v1, v0, Lz9/p;->g:I

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
    iput v1, v0, Lz9/p;->g:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lz9/p;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lz9/p;-><init>(Lz9/r;Lac/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lz9/p;->e:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lz9/p;->g:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object p1, v0, Lz9/p;->d:Lz9/r;

    .line 35
    .line 36
    invoke-static {p3}, Lub/a;->f(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_2
    invoke-static {p3}, Lub/a;->f(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object p3, p0, Lz9/r;->n:Lx0/e1;

    .line 52
    .line 53
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {p3, v1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-static {}, La9/i;->c()Lcom/cnl/kikoeru/data/db/AppDatabase;

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    invoke-virtual {p3}, Lcom/cnl/kikoeru/data/db/AppDatabase;->u()Ld9/s;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    iput-object p0, v0, Lz9/p;->d:Lz9/r;

    .line 69
    .line 70
    iput v2, v0, Lz9/p;->g:I

    .line 71
    .line 72
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-static {p3, p1, p2, v0}, La0/c;->z(Ld9/s;JLac/c;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    sget-object p1, Lzb/a;->a:Lzb/a;

    .line 80
    .line 81
    if-ne p3, p1, :cond_3

    .line 82
    .line 83
    return-object p1

    .line 84
    :cond_3
    move-object p1, p0

    .line 85
    :goto_1
    check-cast p3, Ljava/util/List;

    .line 86
    .line 87
    check-cast p3, Ljava/lang/Iterable;

    .line 88
    .line 89
    new-instance p2, Lz9/o;

    .line 90
    .line 91
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 92
    .line 93
    .line 94
    new-instance v0, Lj9/l;

    .line 95
    .line 96
    const/4 v1, 0x2

    .line 97
    invoke-direct {v0, v1, p2}, Lj9/l;-><init>(ILjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-static {p3, v0}, Lvb/m;->C0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    iget-object p1, p1, Lz9/r;->m:Lx0/e1;

    .line 108
    .line 109
    invoke-virtual {p1, p2}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 113
    .line 114
    return-object p1
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
