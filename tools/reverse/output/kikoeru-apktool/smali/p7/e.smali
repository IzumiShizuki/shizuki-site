.class public final Lp7/e;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lp7/b;


# instance fields
.field public final a:Lp7/j;

.field public final b:Lp7/j;

.field public final c:Ljava/lang/ThreadLocal;

.field public final d:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final e:J


# direct methods
.method public constructor <init>(Lm0/w;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Lp7/e;->c:Ljava/lang/ThreadLocal;

    .line 3
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lp7/e;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    sget v0, Lff/a;->d:I

    const/16 v0, 0x1e

    sget-object v1, Lff/c;->d:Lff/c;

    invoke-static {v0, v1}, Lff/f;->m(ILff/c;)J

    move-result-wide v0

    iput-wide v0, p0, Lp7/e;->e:J

    .line 5
    new-instance v0, Lp7/j;

    new-instance v1, Landroidx/lifecycle/n0;

    const/16 v2, 0x16

    invoke-direct {v1, v2, p1}, Landroidx/lifecycle/n0;-><init>(ILjava/lang/Object;)V

    const/4 p1, 0x1

    invoke-direct {v0, p1, v1}, Lp7/j;-><init>(ILic/a;)V

    iput-object v0, p0, Lp7/e;->a:Lp7/j;

    .line 6
    iput-object v0, p0, Lp7/e;->b:Lp7/j;

    return-void
.end method

.method public constructor <init>(Lm0/w;Ljava/lang/String;I)V
    .locals 4

    const-string v0, "fileName"

    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Lp7/e;->c:Ljava/lang/ThreadLocal;

    .line 9
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lp7/e;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    sget v0, Lff/a;->d:I

    const/16 v0, 0x1e

    sget-object v2, Lff/c;->d:Lff/c;

    invoke-static {v0, v2}, Lff/f;->m(ILff/c;)J

    move-result-wide v2

    iput-wide v2, p0, Lp7/e;->e:J

    if-lez p3, :cond_0

    .line 11
    new-instance v0, Lp7/j;

    .line 12
    new-instance v2, Lp7/c;

    invoke-direct {v2, p1, p2, v1}, Lp7/c;-><init>(Lm0/w;Ljava/lang/String;I)V

    .line 13
    invoke-direct {v0, p3, v2}, Lp7/j;-><init>(ILic/a;)V

    .line 14
    iput-object v0, p0, Lp7/e;->a:Lp7/j;

    .line 15
    new-instance p3, Lp7/j;

    new-instance v0, Lp7/c;

    const/4 v1, 0x1

    invoke-direct {v0, p1, p2, v1}, Lp7/c;-><init>(Lm0/w;Ljava/lang/String;I)V

    invoke-direct {p3, v1, v0}, Lp7/j;-><init>(ILic/a;)V

    .line 16
    iput-object p3, p0, Lp7/e;->b:Lp7/j;

    return-void

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Maximum number of readers must be greater than 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final S(ZLic/n;Lac/c;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    instance-of v4, v3, Lp7/d;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v3

    .line 14
    check-cast v4, Lp7/d;

    .line 15
    .line 16
    iget v5, v4, Lp7/d;->m:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, Lp7/d;->m:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, Lp7/d;

    .line 29
    .line 30
    invoke-direct {v4, v1, v3}, Lp7/d;-><init>(Lp7/e;Lac/c;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v3, v4, Lac/c;->b:Lyb/h;

    .line 34
    .line 35
    iget-object v5, v4, Lp7/d;->k:Ljava/lang/Object;

    .line 36
    .line 37
    iget v6, v4, Lp7/d;->m:I

    .line 38
    .line 39
    const-string v7, "ROLLBACK TRANSACTION"

    .line 40
    .line 41
    const-string v8, "<this>"

    .line 42
    .line 43
    const/4 v10, 0x4

    .line 44
    const/4 v11, 0x3

    .line 45
    const/4 v12, 0x2

    .line 46
    const/4 v13, 0x1

    .line 47
    const/4 v14, 0x0

    .line 48
    sget-object v15, Lzb/a;->a:Lzb/a;

    .line 49
    .line 50
    if-eqz v6, :cond_5

    .line 51
    .line 52
    if-eq v6, v13, :cond_4

    .line 53
    .line 54
    if-eq v6, v12, :cond_3

    .line 55
    .line 56
    if-eq v6, v11, :cond_2

    .line 57
    .line 58
    if-ne v6, v10, :cond_1

    .line 59
    .line 60
    iget-object v0, v4, Lp7/d;->e:Ljava/io/Serializable;

    .line 61
    .line 62
    move-object v2, v0

    .line 63
    check-cast v2, Ljc/y;

    .line 64
    .line 65
    iget-object v0, v4, Lp7/d;->d:Ljava/lang/Object;

    .line 66
    .line 67
    move-object v3, v0

    .line 68
    check-cast v3, Lp7/j;

    .line 69
    .line 70
    :try_start_0
    invoke-static {v5}, Lub/a;->f(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    .line 73
    goto/16 :goto_7

    .line 74
    .line 75
    :catchall_0
    move-exception v0

    .line 76
    move-object v6, v2

    .line 77
    move-object v2, v0

    .line 78
    goto/16 :goto_8

    .line 79
    .line 80
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 81
    .line 82
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 83
    .line 84
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw v0

    .line 88
    :cond_2
    iget-boolean v0, v4, Lp7/d;->j:Z

    .line 89
    .line 90
    iget-object v2, v4, Lp7/d;->i:Ljc/y;

    .line 91
    .line 92
    iget-object v3, v4, Lp7/d;->h:Lyb/h;

    .line 93
    .line 94
    iget-object v6, v4, Lp7/d;->g:Ljc/y;

    .line 95
    .line 96
    iget-object v11, v4, Lp7/d;->f:Lp7/j;

    .line 97
    .line 98
    iget-object v12, v4, Lp7/d;->e:Ljava/io/Serializable;

    .line 99
    .line 100
    check-cast v12, Lic/n;

    .line 101
    .line 102
    iget-object v9, v4, Lp7/d;->d:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v9, Lp7/e;

    .line 105
    .line 106
    :try_start_1
    invoke-static {v5}, Lub/a;->f(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 107
    .line 108
    .line 109
    move-object/from16 v16, v9

    .line 110
    .line 111
    move-object v9, v5

    .line 112
    move-object v5, v11

    .line 113
    move-object/from16 v11, v16

    .line 114
    .line 115
    goto/16 :goto_4

    .line 116
    .line 117
    :catchall_1
    move-exception v0

    .line 118
    move-object v2, v0

    .line 119
    move-object v3, v11

    .line 120
    goto/16 :goto_8

    .line 121
    .line 122
    :cond_3
    invoke-static {v5}, Lub/a;->f(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    return-object v5

    .line 126
    :cond_4
    invoke-static {v5}, Lub/a;->f(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    return-object v5

    .line 130
    :cond_5
    invoke-static {v5}, Lub/a;->f(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    iget-object v5, v1, Lp7/e;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 134
    .line 135
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-nez v5, :cond_17

    .line 140
    .line 141
    iget-object v5, v1, Lp7/e;->c:Ljava/lang/ThreadLocal;

    .line 142
    .line 143
    invoke-virtual {v5}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    check-cast v6, Lp7/r;

    .line 148
    .line 149
    sget-object v9, Lp7/a;->b:Lm3/l;

    .line 150
    .line 151
    if-nez v6, :cond_7

    .line 152
    .line 153
    invoke-static {v3}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    invoke-interface {v3, v9}, Lyb/h;->R(Lyb/g;)Lyb/f;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    check-cast v6, Lp7/a;

    .line 161
    .line 162
    if-eqz v6, :cond_6

    .line 163
    .line 164
    iget-object v6, v6, Lp7/a;->a:Lp7/r;

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_6
    move-object v6, v14

    .line 168
    :cond_7
    :goto_1
    if-eqz v6, :cond_d

    .line 169
    .line 170
    if-nez v0, :cond_9

    .line 171
    .line 172
    iget-boolean v0, v6, Lp7/r;->b:Z

    .line 173
    .line 174
    if-nez v0, :cond_8

    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_8
    const-string v0, "Cannot upgrade connection from reader to writer"

    .line 178
    .line 179
    invoke-static {v13, v0}, Lud/n;->D(ILjava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw v14

    .line 183
    :cond_9
    :goto_2
    invoke-static {v3}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    invoke-interface {v3, v9}, Lyb/h;->R(Lyb/g;)Lyb/f;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    if-nez v0, :cond_b

    .line 191
    .line 192
    new-instance v0, Lp7/a;

    .line 193
    .line 194
    invoke-direct {v0, v6}, Lp7/a;-><init>(Lp7/r;)V

    .line 195
    .line 196
    .line 197
    invoke-static {v5, v8}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    new-instance v3, Lnf/u;

    .line 201
    .line 202
    invoke-direct {v3, v6, v5}, Lnf/u;-><init>(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V

    .line 203
    .line 204
    .line 205
    invoke-static {v0, v3}, Lud/b;->C(Lyb/f;Lyb/h;)Lyb/h;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    new-instance v3, Llf/w0;

    .line 210
    .line 211
    const/16 v5, 0xd

    .line 212
    .line 213
    invoke-direct {v3, v2, v6, v14, v5}, Llf/w0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 214
    .line 215
    .line 216
    iput v13, v4, Lp7/d;->m:I

    .line 217
    .line 218
    invoke-static {v0, v3, v4}, Lhf/a0;->H(Lyb/h;Lic/n;Lyb/c;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    if-ne v0, v15, :cond_a

    .line 223
    .line 224
    goto/16 :goto_6

    .line 225
    .line 226
    :cond_a
    return-object v0

    .line 227
    :cond_b
    iput v12, v4, Lp7/d;->m:I

    .line 228
    .line 229
    invoke-interface {v2, v6, v4}, Lic/n;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    if-ne v0, v15, :cond_c

    .line 234
    .line 235
    goto/16 :goto_6

    .line 236
    .line 237
    :cond_c
    return-object v0

    .line 238
    :cond_d
    if-eqz v0, :cond_e

    .line 239
    .line 240
    iget-object v5, v1, Lp7/e;->a:Lp7/j;

    .line 241
    .line 242
    goto :goto_3

    .line 243
    :cond_e
    iget-object v5, v1, Lp7/e;->b:Lp7/j;

    .line 244
    .line 245
    :goto_3
    new-instance v6, Ljc/y;

    .line 246
    .line 247
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 248
    .line 249
    .line 250
    :try_start_2
    invoke-static {v3}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    iget-wide v13, v1, Lp7/e;->e:J

    .line 254
    .line 255
    new-instance v9, Lba/s;

    .line 256
    .line 257
    const/4 v12, 0x3

    .line 258
    invoke-direct {v9, v1, v0, v12}, Lba/s;-><init>(Ljava/lang/Object;ZI)V

    .line 259
    .line 260
    .line 261
    iput-object v1, v4, Lp7/d;->d:Ljava/lang/Object;

    .line 262
    .line 263
    move-object v12, v2

    .line 264
    check-cast v12, Ljava/io/Serializable;

    .line 265
    .line 266
    iput-object v12, v4, Lp7/d;->e:Ljava/io/Serializable;

    .line 267
    .line 268
    iput-object v5, v4, Lp7/d;->f:Lp7/j;

    .line 269
    .line 270
    iput-object v6, v4, Lp7/d;->g:Ljc/y;

    .line 271
    .line 272
    iput-object v3, v4, Lp7/d;->h:Lyb/h;

    .line 273
    .line 274
    iput-object v6, v4, Lp7/d;->i:Ljc/y;

    .line 275
    .line 276
    iput-boolean v0, v4, Lp7/d;->j:Z

    .line 277
    .line 278
    iput v11, v4, Lp7/d;->m:I

    .line 279
    .line 280
    invoke-virtual {v5, v13, v14, v9, v4}, Lp7/j;->b(JLba/s;Lac/c;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v9

    .line 284
    if-ne v9, v15, :cond_f

    .line 285
    .line 286
    goto :goto_6

    .line 287
    :cond_f
    move-object v11, v1

    .line 288
    move-object v12, v2

    .line 289
    move-object v2, v6

    .line 290
    :goto_4
    check-cast v9, Lp7/f;

    .line 291
    .line 292
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    const-string v13, "context"

    .line 296
    .line 297
    invoke-static {v3, v13}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    iput-object v3, v9, Lp7/f;->c:Lyb/h;

    .line 301
    .line 302
    new-instance v3, Ljava/lang/Throwable;

    .line 303
    .line 304
    invoke-direct {v3}, Ljava/lang/Throwable;-><init>()V

    .line 305
    .line 306
    .line 307
    iput-object v3, v9, Lp7/f;->d:Ljava/lang/Throwable;

    .line 308
    .line 309
    iget-object v3, v11, Lp7/e;->a:Lp7/j;

    .line 310
    .line 311
    iget-object v13, v11, Lp7/e;->b:Lp7/j;

    .line 312
    .line 313
    if-eq v3, v13, :cond_10

    .line 314
    .line 315
    if-eqz v0, :cond_10

    .line 316
    .line 317
    const/4 v0, 0x1

    .line 318
    goto :goto_5

    .line 319
    :cond_10
    const/4 v0, 0x0

    .line 320
    :goto_5
    new-instance v3, Lp7/r;

    .line 321
    .line 322
    invoke-direct {v3, v9, v0}, Lp7/r;-><init>(Lp7/f;Z)V

    .line 323
    .line 324
    .line 325
    iput-object v3, v2, Ljc/y;->a:Ljava/lang/Object;

    .line 326
    .line 327
    iget-object v0, v6, Ljc/y;->a:Ljava/lang/Object;

    .line 328
    .line 329
    if-eqz v0, :cond_14

    .line 330
    .line 331
    check-cast v0, Lp7/r;

    .line 332
    .line 333
    new-instance v2, Lp7/a;

    .line 334
    .line 335
    invoke-direct {v2, v0}, Lp7/a;-><init>(Lp7/r;)V

    .line 336
    .line 337
    .line 338
    iget-object v3, v11, Lp7/e;->c:Ljava/lang/ThreadLocal;

    .line 339
    .line 340
    invoke-static {v3, v8}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    new-instance v8, Lnf/u;

    .line 344
    .line 345
    invoke-direct {v8, v0, v3}, Lnf/u;-><init>(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V

    .line 346
    .line 347
    .line 348
    invoke-static {v2, v8}, Lud/b;->C(Lyb/f;Lyb/h;)Lyb/h;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    new-instance v2, Llf/w0;

    .line 353
    .line 354
    const/16 v3, 0xe

    .line 355
    .line 356
    const/4 v8, 0x0

    .line 357
    invoke-direct {v2, v12, v6, v8, v3}, Llf/w0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 358
    .line 359
    .line 360
    iput-object v5, v4, Lp7/d;->d:Ljava/lang/Object;

    .line 361
    .line 362
    iput-object v6, v4, Lp7/d;->e:Ljava/io/Serializable;

    .line 363
    .line 364
    iput-object v8, v4, Lp7/d;->f:Lp7/j;

    .line 365
    .line 366
    iput-object v8, v4, Lp7/d;->g:Ljc/y;

    .line 367
    .line 368
    iput-object v8, v4, Lp7/d;->h:Lyb/h;

    .line 369
    .line 370
    iput-object v8, v4, Lp7/d;->i:Ljc/y;

    .line 371
    .line 372
    iput v10, v4, Lp7/d;->m:I

    .line 373
    .line 374
    invoke-static {v0, v2, v4}, Lhf/a0;->H(Lyb/h;Lic/n;Lyb/c;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 378
    if-ne v0, v15, :cond_11

    .line 379
    .line 380
    :goto_6
    return-object v15

    .line 381
    :cond_11
    move-object v3, v5

    .line 382
    move-object v2, v6

    .line 383
    move-object v5, v0

    .line 384
    :goto_7
    :try_start_3
    iget-object v0, v2, Ljc/y;->a:Ljava/lang/Object;

    .line 385
    .line 386
    check-cast v0, Lp7/r;

    .line 387
    .line 388
    if-eqz v0, :cond_13

    .line 389
    .line 390
    iget-object v2, v0, Lp7/r;->a:Lp7/f;

    .line 391
    .line 392
    iget-object v0, v0, Lp7/r;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 393
    .line 394
    const/4 v4, 0x0

    .line 395
    const/4 v9, 0x1

    .line 396
    invoke-virtual {v0, v4, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 397
    .line 398
    .line 399
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 400
    if-eqz v0, :cond_12

    .line 401
    .line 402
    :try_start_4
    invoke-static {v2, v7}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V
    :try_end_4
    .catch Landroid/database/SQLException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 403
    .line 404
    .line 405
    :catch_0
    :cond_12
    const/4 v12, 0x0

    .line 406
    :try_start_5
    iput-object v12, v2, Lp7/f;->c:Lyb/h;

    .line 407
    .line 408
    iput-object v12, v2, Lp7/f;->d:Ljava/lang/Throwable;

    .line 409
    .line 410
    invoke-virtual {v3, v2}, Lp7/j;->e(Lp7/f;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 411
    .line 412
    .line 413
    :catchall_2
    :cond_13
    return-object v5

    .line 414
    :catchall_3
    move-exception v0

    .line 415
    move-object v2, v0

    .line 416
    move-object v3, v5

    .line 417
    goto :goto_8

    .line 418
    :cond_14
    :try_start_6
    const-string v0, "Required value was null."

    .line 419
    .line 420
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 421
    .line 422
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 426
    :goto_8
    :try_start_7
    throw v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 427
    :catchall_4
    move-exception v0

    .line 428
    move-object v4, v0

    .line 429
    :try_start_8
    iget-object v0, v6, Ljc/y;->a:Ljava/lang/Object;

    .line 430
    .line 431
    check-cast v0, Lp7/r;

    .line 432
    .line 433
    if-eqz v0, :cond_16

    .line 434
    .line 435
    iget-object v5, v0, Lp7/r;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 436
    .line 437
    const/4 v6, 0x0

    .line 438
    const/4 v9, 0x1

    .line 439
    invoke-virtual {v5, v6, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 440
    .line 441
    .line 442
    move-result v5
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 443
    if-eqz v5, :cond_15

    .line 444
    .line 445
    :try_start_9
    iget-object v5, v0, Lp7/r;->a:Lp7/f;

    .line 446
    .line 447
    invoke-static {v5, v7}, Lud/n;->g(Lz7/a;Ljava/lang/String;)V
    :try_end_9
    .catch Landroid/database/SQLException; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 448
    .line 449
    .line 450
    :catch_1
    :cond_15
    :try_start_a
    iget-object v0, v0, Lp7/r;->a:Lp7/f;

    .line 451
    .line 452
    const/4 v12, 0x0

    .line 453
    iput-object v12, v0, Lp7/f;->c:Lyb/h;

    .line 454
    .line 455
    iput-object v12, v0, Lp7/f;->d:Ljava/lang/Throwable;

    .line 456
    .line 457
    invoke-virtual {v3, v0}, Lp7/j;->e(Lp7/f;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 458
    .line 459
    .line 460
    goto :goto_9

    .line 461
    :catchall_5
    move-exception v0

    .line 462
    invoke-static {v2, v0}, Lub/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 463
    .line 464
    .line 465
    :cond_16
    :goto_9
    throw v4

    .line 466
    :cond_17
    const/16 v0, 0x15

    .line 467
    .line 468
    const-string v2, "Connection pool is closed"

    .line 469
    .line 470
    invoke-static {v0, v2}, Lud/n;->D(ILjava/lang/String;)V

    .line 471
    .line 472
    .line 473
    const/4 v12, 0x0

    .line 474
    throw v12
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
.end method

.method public final close()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, Lp7/e;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lp7/e;->a:Lp7/j;

    .line 12
    .line 13
    invoke-virtual {v0}, Lp7/j;->c()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lp7/e;->b:Lp7/j;

    .line 17
    .line 18
    invoke-virtual {v0}, Lp7/j;->c()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
