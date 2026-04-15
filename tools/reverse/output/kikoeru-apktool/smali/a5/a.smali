.class public final La5/a;
.super Lp4/t;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final synthetic h:Lt4/f;

.field public final synthetic i:I

.field public final synthetic j:Lz4/m;


# direct methods
.method public constructor <init>(Lt4/f;ILz4/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, La5/a;->h:Lt4/f;

    .line 2
    .line 3
    iput p2, p0, La5/a;->i:I

    .line 4
    .line 5
    iput-object p3, p0, La5/a;->j:Lz4/m;

    .line 6
    .line 7
    invoke-direct {p0}, Lp4/t;-><init>()V

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
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object v0, p0, La5/a;->j:Lz4/m;

    .line 2
    .line 3
    iget-object v1, v0, Lz4/m;->b:Lya/i0;

    .line 4
    .line 5
    iget-object v2, v0, Lz4/m;->e:Lz4/j;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    goto/16 :goto_3

    .line 11
    .line 12
    :cond_0
    iget-object v4, v0, Lz4/m;->a:Lm4/q;

    .line 13
    .line 14
    iget-object v5, v4, Lm4/q;->m:Ljava/lang/String;

    .line 15
    .line 16
    sget-object v6, Lo6/j;->l0:Lm3/l;

    .line 17
    .line 18
    if-eqz v5, :cond_2

    .line 19
    .line 20
    const-string v7, "video/webm"

    .line 21
    .line 22
    invoke-virtual {v5, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v7

    .line 26
    if-nez v7, :cond_1

    .line 27
    .line 28
    const-string v7, "audio/webm"

    .line 29
    .line 30
    invoke-virtual {v5, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_2

    .line 35
    .line 36
    :cond_1
    new-instance v5, Lj6/d;

    .line 37
    .line 38
    const/4 v7, 0x2

    .line 39
    invoke-direct {v5, v6, v7}, Lj6/d;-><init>(Lo6/j;I)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    new-instance v5, Ll6/j;

    .line 44
    .line 45
    const/16 v7, 0x20

    .line 46
    .line 47
    invoke-direct {v5, v6, v7}, Ll6/j;-><init>(Lo6/j;I)V

    .line 48
    .line 49
    .line 50
    :goto_0
    new-instance v12, Lk5/e;

    .line 51
    .line 52
    iget v6, p0, La5/a;->i:I

    .line 53
    .line 54
    invoke-direct {v12, v5, v6, v4}, Lk5/e;-><init>(Lr5/n;ILm4/q;)V

    .line 55
    .line 56
    .line 57
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Lz4/m;->f()Lz4/j;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    if-nez v4, :cond_3

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    const/4 v13, 0x0

    .line 68
    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    check-cast v6, Lz4/b;

    .line 73
    .line 74
    iget-object v6, v6, Lz4/b;->a:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Lz4/j;->a(Lz4/j;Ljava/lang/String;)Lz4/j;

    .line 77
    .line 78
    .line 79
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    iget-object v7, p0, La5/a;->h:Lt4/f;

    .line 81
    .line 82
    if-nez v6, :cond_4

    .line 83
    .line 84
    :try_start_1
    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    check-cast v6, Lz4/b;

    .line 89
    .line 90
    iget-object v6, v6, Lz4/b;->a:Ljava/lang/String;

    .line 91
    .line 92
    invoke-static {v0, v6, v2, v13}, Lud/s;->e(Lz4/m;Ljava/lang/String;Lz4/j;I)Ls4/m;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    new-instance v6, Lk5/k;

    .line 97
    .line 98
    iget-object v9, v0, Lz4/m;->a:Lm4/q;

    .line 99
    .line 100
    const/4 v10, 0x0

    .line 101
    const/4 v11, 0x0

    .line 102
    invoke-direct/range {v6 .. v12}, Lk5/k;-><init>(Ls4/h;Ls4/m;Lm4/q;ILjava/lang/Object;Lk5/e;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v6}, Lk5/k;->i()V

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_4
    move-object v4, v6

    .line 110
    :goto_1
    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    check-cast v1, Lz4/b;

    .line 115
    .line 116
    iget-object v1, v1, Lz4/b;->a:Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {v0, v1, v4, v13}, Lud/s;->e(Lz4/m;Ljava/lang/String;Lz4/j;I)Ls4/m;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    new-instance v6, Lk5/k;

    .line 123
    .line 124
    iget-object v9, v0, Lz4/m;->a:Lm4/q;

    .line 125
    .line 126
    const/4 v10, 0x0

    .line 127
    const/4 v11, 0x0

    .line 128
    invoke-direct/range {v6 .. v12}, Lk5/k;-><init>(Ls4/h;Ls4/m;Lm4/q;ILjava/lang/Object;Lk5/e;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v6}, Lk5/k;->i()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 132
    .line 133
    .line 134
    :goto_2
    invoke-interface {v5}, Lr5/n;->a()V

    .line 135
    .line 136
    .line 137
    iget-object v0, v12, Lk5/e;->h:Lr5/b0;

    .line 138
    .line 139
    instance-of v1, v0, Lr5/j;

    .line 140
    .line 141
    if-eqz v1, :cond_5

    .line 142
    .line 143
    move-object v3, v0

    .line 144
    check-cast v3, Lr5/j;

    .line 145
    .line 146
    :cond_5
    :goto_3
    return-object v3

    .line 147
    :catchall_0
    move-exception v0

    .line 148
    iget-object v1, v12, Lk5/e;->a:Lr5/n;

    .line 149
    .line 150
    invoke-interface {v1}, Lr5/n;->a()V

    .line 151
    .line 152
    .line 153
    throw v0
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
