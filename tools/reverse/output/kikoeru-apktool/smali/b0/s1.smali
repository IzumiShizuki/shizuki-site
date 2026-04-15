.class public final Lb0/s1;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lb0/s1;->b:I

    .line 2
    .line 3
    iput-object p2, p0, Lb0/s1;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lb0/s1;->d:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
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
.method public final b()Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lb0/s1;->b:I

    .line 4
    .line 5
    const/4 v4, 0x2

    .line 6
    const/4 v5, -0x1

    .line 7
    const/4 v6, 0x0

    .line 8
    const/4 v7, 0x0

    .line 9
    const-wide/16 v8, 0x0

    .line 10
    .line 11
    const/4 v10, 0x3

    .line 12
    const/4 v11, 0x1

    .line 13
    sget-object v12, Lub/a0;->a:Lub/a0;

    .line 14
    .line 15
    iget-object v13, v0, Lb0/s1;->d:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v14, v0, Lb0/s1;->c:Ljava/lang/Object;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    check-cast v14, Lx0/w0;

    .line 23
    .line 24
    invoke-interface {v14}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Lic/a;

    .line 29
    .line 30
    invoke-interface {v1}, Lic/a;->b()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/lang/Number;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    check-cast v13, Lx0/w0;

    .line 41
    .line 42
    invoke-interface {v13}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, Ljava/lang/Number;

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    const/high16 v3, 0x447a0000    # 1000.0f

    .line 53
    .line 54
    div-float/2addr v2, v3

    .line 55
    div-float/2addr v1, v2

    .line 56
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    return-object v1

    .line 61
    :pswitch_0
    check-cast v13, Luh/y;

    .line 62
    .line 63
    iget-object v1, v13, Luh/y;->j:Lx0/e1;

    .line 64
    .line 65
    invoke-virtual {v1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-static {v14, v1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    return-object v1

    .line 78
    :pswitch_1
    check-cast v14, Luh/j;

    .line 79
    .line 80
    iget-object v2, v14, Luh/j;->a:Luh/y;

    .line 81
    .line 82
    invoke-virtual {v2}, Luh/y;->d()Luh/x;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    iget-object v7, v2, Luh/y;->j:Lx0/e1;

    .line 87
    .line 88
    const/4 v5, 0x0

    .line 89
    if-eqz v1, :cond_0

    .line 90
    .line 91
    invoke-virtual {v1}, Luh/x;->c()J

    .line 92
    .line 93
    .line 94
    move-result-wide v3

    .line 95
    new-instance v1, Lf3/j;

    .line 96
    .line 97
    invoke-direct {v1, v3, v4}, Lf3/j;-><init>(J)V

    .line 98
    .line 99
    .line 100
    move-object v14, v1

    .line 101
    goto :goto_0

    .line 102
    :cond_0
    move-object v14, v5

    .line 103
    :goto_0
    invoke-virtual {v2}, Luh/y;->d()Luh/x;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    if-eqz v1, :cond_1

    .line 108
    .line 109
    invoke-virtual {v1}, Luh/x;->a()I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    goto :goto_1

    .line 118
    :cond_1
    move-object v1, v5

    .line 119
    :goto_1
    if-eqz v1, :cond_2

    .line 120
    .line 121
    invoke-virtual {v7}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    iget-object v3, v2, Luh/y;->r:Lx0/e1;

    .line 126
    .line 127
    invoke-virtual {v3, v1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2}, Luh/y;->e()J

    .line 131
    .line 132
    .line 133
    move-result-wide v3

    .line 134
    iget-object v15, v2, Luh/y;->b:Lhf/y;

    .line 135
    .line 136
    new-instance v1, Lc2/g0;

    .line 137
    .line 138
    const/4 v6, 0x5

    .line 139
    invoke-direct/range {v1 .. v6}, Lc2/g0;-><init>(Ljava/lang/Object;JLyb/c;I)V

    .line 140
    .line 141
    .line 142
    invoke-static {v15, v5, v5, v1, v10}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 143
    .line 144
    .line 145
    :cond_2
    iget-object v1, v2, Luh/y;->l:Lx0/e1;

    .line 146
    .line 147
    new-instance v3, Lp1/b;

    .line 148
    .line 149
    invoke-direct {v3, v8, v9}, Lp1/b;-><init>(J)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1, v3}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v7, v5}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    if-eqz v14, :cond_3

    .line 159
    .line 160
    iget-wide v8, v14, Lf3/j;->a:J

    .line 161
    .line 162
    :cond_3
    iget-object v1, v2, Luh/y;->m:Lx0/e1;

    .line 163
    .line 164
    new-instance v3, Lf3/j;

    .line 165
    .line 166
    invoke-direct {v3, v8, v9}, Lf3/j;-><init>(J)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1, v3}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    iget-object v1, v2, Luh/y;->f:Luh/g0;

    .line 173
    .line 174
    iget-object v3, v1, Luh/g0;->b:Lhf/y;

    .line 175
    .line 176
    new-instance v4, Luh/e0;

    .line 177
    .line 178
    invoke-direct {v4, v1, v5, v11}, Luh/e0;-><init>(Luh/g0;Lyb/c;I)V

    .line 179
    .line 180
    .line 181
    invoke-static {v3, v5, v5, v4, v10}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 182
    .line 183
    .line 184
    iget-object v1, v2, Luh/y;->n:Lx0/e1;

    .line 185
    .line 186
    invoke-virtual {v1, v5}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    iget-object v1, v2, Luh/y;->o:Lx0/e1;

    .line 190
    .line 191
    invoke-virtual {v1, v5}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    check-cast v13, Lic/a;

    .line 195
    .line 196
    invoke-interface {v13}, Lic/a;->b()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    return-object v12

    .line 200
    :pswitch_2
    check-cast v14, Ljc/y;

    .line 201
    .line 202
    check-cast v13, Ls/b0;

    .line 203
    .line 204
    sget-object v1, Lg2/e1;->a:Lx0/z;

    .line 205
    .line 206
    invoke-static {v13, v1}, Li2/f;->i(Li2/l;Lx0/m1;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    iput-object v1, v14, Ljc/y;->a:Ljava/lang/Object;

    .line 211
    .line 212
    return-object v12

    .line 213
    :pswitch_3
    check-cast v14, Ls/i;

    .line 214
    .line 215
    iget-object v1, v14, Ls/i;->r:Lq1/l0;

    .line 216
    .line 217
    check-cast v13, Li2/l0;

    .line 218
    .line 219
    iget-object v2, v13, Li2/l0;->a:Ls1/b;

    .line 220
    .line 221
    iget-object v2, v2, Ls1/b;->b:Lc7/e1;

    .line 222
    .line 223
    invoke-virtual {v2}, Lc7/e1;->D()J

    .line 224
    .line 225
    .line 226
    move-result-wide v2

    .line 227
    invoke-virtual {v13}, Li2/l0;->getLayoutDirection()Lf3/m;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    invoke-interface {v1, v2, v3, v4, v13}, Lq1/l0;->a(JLf3/m;Lf3/c;)Lq1/h0;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    iput-object v1, v14, Ls/i;->w:Lq1/h0;

    .line 236
    .line 237
    return-object v12

    .line 238
    :pswitch_4
    check-cast v14, Lkf/j;

    .line 239
    .line 240
    invoke-interface {v14, v13}, Lkf/u;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    return-object v12

    .line 244
    :pswitch_5
    check-cast v14, Ljc/y;

    .line 245
    .line 246
    check-cast v13, Lo1/v;

    .line 247
    .line 248
    invoke-virtual {v13}, Lo1/v;->C0()Lo1/n;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    iput-object v1, v14, Ljc/y;->a:Ljava/lang/Object;

    .line 253
    .line 254
    return-object v12

    .line 255
    :pswitch_6
    check-cast v14, Lic/a;

    .line 256
    .line 257
    if-eqz v14, :cond_5

    .line 258
    .line 259
    invoke-interface {v14}, Lic/a;->b()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    check-cast v1, Lp1/c;

    .line 264
    .line 265
    if-nez v1, :cond_4

    .line 266
    .line 267
    goto :goto_2

    .line 268
    :cond_4
    move-object v7, v1

    .line 269
    goto :goto_4

    .line 270
    :cond_5
    :goto_2
    check-cast v13, Li2/g1;

    .line 271
    .line 272
    invoke-virtual {v13}, Li2/g1;->M0()Lj1/p;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    iget-boolean v1, v1, Lj1/p;->n:Z

    .line 277
    .line 278
    if-eqz v1, :cond_6

    .line 279
    .line 280
    goto :goto_3

    .line 281
    :cond_6
    move-object v13, v7

    .line 282
    :goto_3
    if-eqz v13, :cond_7

    .line 283
    .line 284
    iget-wide v1, v13, Lg2/g1;->c:J

    .line 285
    .line 286
    invoke-static {v1, v2}, Lgh/g;->R(J)J

    .line 287
    .line 288
    .line 289
    move-result-wide v1

    .line 290
    invoke-static {v8, v9, v1, v2}, Ln7/b0;->f(JJ)Lp1/c;

    .line 291
    .line 292
    .line 293
    move-result-object v7

    .line 294
    :cond_7
    :goto_4
    return-object v7

    .line 295
    :pswitch_7
    check-cast v14, Ln1/b;

    .line 296
    .line 297
    iget-object v1, v14, Ln1/b;->q:Lic/k;

    .line 298
    .line 299
    check-cast v13, Ln1/c;

    .line 300
    .line 301
    invoke-interface {v1, v13}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    return-object v12

    .line 305
    :pswitch_8
    check-cast v14, Ll0/l1;

    .line 306
    .line 307
    check-cast v13, Lx0/w0;

    .line 308
    .line 309
    invoke-interface {v13}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    check-cast v1, Lf3/l;

    .line 314
    .line 315
    iget-wide v12, v1, Lf3/l;->a:J

    .line 316
    .line 317
    invoke-virtual {v14}, Ll0/l1;->g()Lp1/b;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    if-eqz v1, :cond_10

    .line 322
    .line 323
    iget-wide v2, v1, Lp1/b;->a:J

    .line 324
    .line 325
    iget-object v1, v14, Ll0/l1;->d:Lh0/u0;

    .line 326
    .line 327
    if-eqz v1, :cond_8

    .line 328
    .line 329
    iget-object v1, v1, Lh0/u0;->a:Lh0/b1;

    .line 330
    .line 331
    iget-object v7, v1, Lh0/b1;->a:Lt2/g;

    .line 332
    .line 333
    :cond_8
    if-eqz v7, :cond_10

    .line 334
    .line 335
    iget-object v1, v7, Lt2/g;->b:Ljava/lang/String;

    .line 336
    .line 337
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 338
    .line 339
    .line 340
    move-result v1

    .line 341
    if-nez v1, :cond_9

    .line 342
    .line 343
    goto/16 :goto_8

    .line 344
    .line 345
    :cond_9
    iget-object v1, v14, Ll0/l1;->r:Lx0/e1;

    .line 346
    .line 347
    invoke-virtual {v1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    check-cast v1, Lh0/h0;

    .line 352
    .line 353
    if-nez v1, :cond_a

    .line 354
    .line 355
    const/4 v1, -0x1

    .line 356
    goto :goto_5

    .line 357
    :cond_a
    sget-object v7, Ll0/n1;->a:[I

    .line 358
    .line 359
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 360
    .line 361
    .line 362
    move-result v1

    .line 363
    aget v1, v7, v1

    .line 364
    .line 365
    :goto_5
    if-eq v1, v5, :cond_10

    .line 366
    .line 367
    const-wide v16, 0xffffffffL

    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    const/16 v5, 0x20

    .line 373
    .line 374
    if-eq v1, v11, :cond_c

    .line 375
    .line 376
    if-eq v1, v4, :cond_c

    .line 377
    .line 378
    if-ne v1, v10, :cond_b

    .line 379
    .line 380
    invoke-virtual {v14}, Ll0/l1;->k()Ly2/y;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    iget-wide v10, v1, Ly2/y;->b:J

    .line 385
    .line 386
    sget v1, Lt2/k0;->c:I

    .line 387
    .line 388
    and-long v10, v10, v16

    .line 389
    .line 390
    :goto_6
    long-to-int v1, v10

    .line 391
    goto :goto_7

    .line 392
    :cond_b
    new-instance v1, Lce/j0;

    .line 393
    .line 394
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 395
    .line 396
    .line 397
    throw v1

    .line 398
    :cond_c
    invoke-virtual {v14}, Ll0/l1;->k()Ly2/y;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    iget-wide v10, v1, Ly2/y;->b:J

    .line 403
    .line 404
    sget v1, Lt2/k0;->c:I

    .line 405
    .line 406
    shr-long/2addr v10, v5

    .line 407
    goto :goto_6

    .line 408
    :goto_7
    iget-object v7, v14, Ll0/l1;->d:Lh0/u0;

    .line 409
    .line 410
    if-eqz v7, :cond_10

    .line 411
    .line 412
    invoke-virtual {v7}, Lh0/u0;->d()Lh0/r1;

    .line 413
    .line 414
    .line 415
    move-result-object v7

    .line 416
    if-nez v7, :cond_d

    .line 417
    .line 418
    goto/16 :goto_8

    .line 419
    .line 420
    :cond_d
    iget-object v10, v14, Ll0/l1;->d:Lh0/u0;

    .line 421
    .line 422
    if-eqz v10, :cond_10

    .line 423
    .line 424
    iget-object v10, v10, Lh0/u0;->a:Lh0/b1;

    .line 425
    .line 426
    iget-object v10, v10, Lh0/b1;->a:Lt2/g;

    .line 427
    .line 428
    if-nez v10, :cond_e

    .line 429
    .line 430
    goto :goto_8

    .line 431
    :cond_e
    iget-object v11, v14, Ll0/l1;->b:Ly2/r;

    .line 432
    .line 433
    invoke-interface {v11, v1}, Ly2/r;->p(I)I

    .line 434
    .line 435
    .line 436
    move-result v1

    .line 437
    iget-object v10, v10, Lt2/g;->b:Ljava/lang/String;

    .line 438
    .line 439
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 440
    .line 441
    .line 442
    move-result v10

    .line 443
    invoke-static {v1, v6, v10}, Lnh/b;->k(III)I

    .line 444
    .line 445
    .line 446
    move-result v1

    .line 447
    invoke-virtual {v7, v2, v3}, Lh0/r1;->d(J)J

    .line 448
    .line 449
    .line 450
    move-result-wide v2

    .line 451
    shr-long/2addr v2, v5

    .line 452
    long-to-int v3, v2

    .line 453
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 454
    .line 455
    .line 456
    move-result v2

    .line 457
    iget-object v3, v7, Lh0/r1;->a:Lt2/i0;

    .line 458
    .line 459
    iget-object v6, v3, Lt2/i0;->b:Lt2/n;

    .line 460
    .line 461
    invoke-virtual {v6, v1}, Lt2/n;->d(I)I

    .line 462
    .line 463
    .line 464
    move-result v1

    .line 465
    invoke-virtual {v3, v1}, Lt2/i0;->e(I)F

    .line 466
    .line 467
    .line 468
    move-result v7

    .line 469
    invoke-virtual {v3, v1}, Lt2/i0;->f(I)F

    .line 470
    .line 471
    .line 472
    move-result v3

    .line 473
    invoke-static {v7, v3}, Ljava/lang/Math;->min(FF)F

    .line 474
    .line 475
    .line 476
    move-result v10

    .line 477
    invoke-static {v7, v3}, Ljava/lang/Math;->max(FF)F

    .line 478
    .line 479
    .line 480
    move-result v3

    .line 481
    invoke-static {v2, v10, v3}, Lnh/b;->j(FFF)F

    .line 482
    .line 483
    .line 484
    move-result v3

    .line 485
    invoke-static {v12, v13, v8, v9}, Lf3/l;->b(JJ)Z

    .line 486
    .line 487
    .line 488
    move-result v7

    .line 489
    if-nez v7, :cond_f

    .line 490
    .line 491
    sub-float/2addr v2, v3

    .line 492
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 493
    .line 494
    .line 495
    move-result v2

    .line 496
    shr-long v7, v12, v5

    .line 497
    .line 498
    long-to-int v8, v7

    .line 499
    div-int/2addr v8, v4

    .line 500
    int-to-float v7, v8

    .line 501
    cmpl-float v2, v2, v7

    .line 502
    .line 503
    if-lez v2, :cond_f

    .line 504
    .line 505
    goto :goto_8

    .line 506
    :cond_f
    invoke-virtual {v6, v1}, Lt2/n;->f(I)F

    .line 507
    .line 508
    .line 509
    move-result v2

    .line 510
    invoke-virtual {v6, v1}, Lt2/n;->b(I)F

    .line 511
    .line 512
    .line 513
    move-result v1

    .line 514
    sub-float/2addr v1, v2

    .line 515
    int-to-float v4, v4

    .line 516
    div-float/2addr v1, v4

    .line 517
    add-float/2addr v1, v2

    .line 518
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 519
    .line 520
    .line 521
    move-result v2

    .line 522
    int-to-long v2, v2

    .line 523
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 524
    .line 525
    .line 526
    move-result v1

    .line 527
    int-to-long v6, v1

    .line 528
    shl-long v1, v2, v5

    .line 529
    .line 530
    and-long v3, v6, v16

    .line 531
    .line 532
    or-long/2addr v1, v3

    .line 533
    move-wide v2, v1

    .line 534
    goto :goto_9

    .line 535
    :cond_10
    :goto_8
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    :goto_9
    new-instance v1, Lp1/b;

    .line 541
    .line 542
    invoke-direct {v1, v2, v3}, Lp1/b;-><init>(J)V

    .line 543
    .line 544
    .line 545
    return-object v1

    .line 546
    :pswitch_9
    check-cast v14, Ll0/s0;

    .line 547
    .line 548
    check-cast v13, Lx0/w0;

    .line 549
    .line 550
    invoke-interface {v13}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v1

    .line 554
    check-cast v1, Lf3/l;

    .line 555
    .line 556
    iget-wide v1, v1, Lf3/l;->a:J

    .line 557
    .line 558
    invoke-virtual {v14}, Ll0/s0;->e()Ll0/r;

    .line 559
    .line 560
    .line 561
    move-result-object v3

    .line 562
    if-nez v3, :cond_11

    .line 563
    .line 564
    goto :goto_b

    .line 565
    :cond_11
    invoke-virtual {v14}, Ll0/s0;->d()Lh0/h0;

    .line 566
    .line 567
    .line 568
    move-result-object v6

    .line 569
    if-nez v6, :cond_12

    .line 570
    .line 571
    const/4 v6, -0x1

    .line 572
    goto :goto_a

    .line 573
    :cond_12
    sget-object v7, Ll0/t0;->a:[I

    .line 574
    .line 575
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 576
    .line 577
    .line 578
    move-result v6

    .line 579
    aget v6, v7, v6

    .line 580
    .line 581
    :goto_a
    if-eq v6, v5, :cond_16

    .line 582
    .line 583
    if-eq v6, v11, :cond_15

    .line 584
    .line 585
    if-eq v6, v4, :cond_14

    .line 586
    .line 587
    if-eq v6, v10, :cond_13

    .line 588
    .line 589
    new-instance v1, Lce/j0;

    .line 590
    .line 591
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 592
    .line 593
    .line 594
    throw v1

    .line 595
    :cond_13
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 596
    .line 597
    const-string v2, "SelectionContainer does not support cursor"

    .line 598
    .line 599
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 600
    .line 601
    .line 602
    throw v1

    .line 603
    :cond_14
    iget-object v3, v3, Ll0/r;->b:Ll0/q;

    .line 604
    .line 605
    invoke-static {v14, v1, v2, v3}, Ll0/u0;->r(Ll0/s0;JLl0/q;)J

    .line 606
    .line 607
    .line 608
    move-result-wide v2

    .line 609
    goto :goto_c

    .line 610
    :cond_15
    iget-object v3, v3, Ll0/r;->a:Ll0/q;

    .line 611
    .line 612
    invoke-static {v14, v1, v2, v3}, Ll0/u0;->r(Ll0/s0;JLl0/q;)J

    .line 613
    .line 614
    .line 615
    move-result-wide v2

    .line 616
    goto :goto_c

    .line 617
    :cond_16
    :goto_b
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    :goto_c
    new-instance v1, Lp1/b;

    .line 623
    .line 624
    invoke-direct {v1, v2, v3}, Lp1/b;-><init>(J)V

    .line 625
    .line 626
    .line 627
    return-object v1

    .line 628
    :pswitch_a
    check-cast v13, Lj2/d0;

    .line 629
    .line 630
    check-cast v14, Lj2/s2;

    .line 631
    .line 632
    iget-object v1, v14, Lj2/s2;->e:Lq2/i;

    .line 633
    .line 634
    iget-object v2, v14, Lj2/s2;->f:Lq2/i;

    .line 635
    .line 636
    iget-object v3, v14, Lj2/s2;->c:Ljava/lang/Float;

    .line 637
    .line 638
    iget-object v4, v14, Lj2/s2;->d:Ljava/lang/Float;

    .line 639
    .line 640
    const/4 v5, 0x0

    .line 641
    if-eqz v1, :cond_17

    .line 642
    .line 643
    if-eqz v3, :cond_17

    .line 644
    .line 645
    iget-object v6, v1, Lq2/i;->a:Ljc/m;

    .line 646
    .line 647
    invoke-interface {v6}, Lic/a;->b()Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object v6

    .line 651
    check-cast v6, Ljava/lang/Number;

    .line 652
    .line 653
    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    .line 654
    .line 655
    .line 656
    move-result v6

    .line 657
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 658
    .line 659
    .line 660
    move-result v3

    .line 661
    sub-float/2addr v6, v3

    .line 662
    goto :goto_d

    .line 663
    :cond_17
    const/4 v6, 0x0

    .line 664
    :goto_d
    if-eqz v2, :cond_18

    .line 665
    .line 666
    if-eqz v4, :cond_18

    .line 667
    .line 668
    iget-object v3, v2, Lq2/i;->a:Ljc/m;

    .line 669
    .line 670
    invoke-interface {v3}, Lic/a;->b()Ljava/lang/Object;

    .line 671
    .line 672
    .line 673
    move-result-object v3

    .line 674
    check-cast v3, Ljava/lang/Number;

    .line 675
    .line 676
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 677
    .line 678
    .line 679
    move-result v3

    .line 680
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 681
    .line 682
    .line 683
    move-result v4

    .line 684
    sub-float/2addr v3, v4

    .line 685
    goto :goto_e

    .line 686
    :cond_18
    const/4 v3, 0x0

    .line 687
    :goto_e
    cmpg-float v4, v6, v5

    .line 688
    .line 689
    if-nez v4, :cond_19

    .line 690
    .line 691
    cmpg-float v3, v3, v5

    .line 692
    .line 693
    if-nez v3, :cond_19

    .line 694
    .line 695
    goto :goto_11

    .line 696
    :cond_19
    iget v3, v14, Lj2/s2;->a:I

    .line 697
    .line 698
    invoke-virtual {v13, v3}, Lj2/d0;->A(I)I

    .line 699
    .line 700
    .line 701
    move-result v3

    .line 702
    invoke-virtual {v13}, Lj2/d0;->t()Lo/m;

    .line 703
    .line 704
    .line 705
    move-result-object v4

    .line 706
    iget v5, v13, Lj2/d0;->n:I

    .line 707
    .line 708
    invoke-virtual {v4, v5}, Lo/m;->b(I)Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object v4

    .line 712
    check-cast v4, Lq2/p;

    .line 713
    .line 714
    if-eqz v4, :cond_1a

    .line 715
    .line 716
    :try_start_0
    iget-object v5, v13, Lj2/d0;->p:Lv3/d;

    .line 717
    .line 718
    if-eqz v5, :cond_1a

    .line 719
    .line 720
    invoke-virtual {v13, v4}, Lj2/d0;->k(Lq2/p;)Landroid/graphics/Rect;

    .line 721
    .line 722
    .line 723
    move-result-object v4

    .line 724
    iget-object v5, v5, Lv3/d;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 725
    .line 726
    invoke-virtual {v5, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 727
    .line 728
    .line 729
    goto :goto_f

    .line 730
    :catch_0
    nop

    .line 731
    :cond_1a
    :goto_f
    invoke-virtual {v13}, Lj2/d0;->t()Lo/m;

    .line 732
    .line 733
    .line 734
    move-result-object v4

    .line 735
    iget v5, v13, Lj2/d0;->o:I

    .line 736
    .line 737
    invoke-virtual {v4, v5}, Lo/m;->b(I)Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object v4

    .line 741
    check-cast v4, Lq2/p;

    .line 742
    .line 743
    if-eqz v4, :cond_1b

    .line 744
    .line 745
    :try_start_1
    iget-object v5, v13, Lj2/d0;->q:Lv3/d;

    .line 746
    .line 747
    if-eqz v5, :cond_1b

    .line 748
    .line 749
    invoke-virtual {v13, v4}, Lj2/d0;->k(Lq2/p;)Landroid/graphics/Rect;

    .line 750
    .line 751
    .line 752
    move-result-object v4

    .line 753
    iget-object v5, v5, Lv3/d;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 754
    .line 755
    invoke-virtual {v5, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 756
    .line 757
    .line 758
    goto :goto_10

    .line 759
    :catch_1
    nop

    .line 760
    :cond_1b
    :goto_10
    iget-object v4, v13, Lj2/d0;->d:Lj2/v;

    .line 761
    .line 762
    invoke-virtual {v4}, Landroid/view/View;->invalidate()V

    .line 763
    .line 764
    .line 765
    invoke-virtual {v13}, Lj2/d0;->t()Lo/m;

    .line 766
    .line 767
    .line 768
    move-result-object v4

    .line 769
    invoke-virtual {v4, v3}, Lo/m;->b(I)Ljava/lang/Object;

    .line 770
    .line 771
    .line 772
    move-result-object v4

    .line 773
    check-cast v4, Lq2/p;

    .line 774
    .line 775
    if-eqz v4, :cond_1e

    .line 776
    .line 777
    iget-object v4, v4, Lq2/p;->a:Lq2/o;

    .line 778
    .line 779
    if-eqz v4, :cond_1e

    .line 780
    .line 781
    iget-object v4, v4, Lq2/o;->c:Li2/j0;

    .line 782
    .line 783
    if-eqz v4, :cond_1e

    .line 784
    .line 785
    if-eqz v1, :cond_1c

    .line 786
    .line 787
    iget-object v5, v13, Lj2/d0;->s:Lo/y;

    .line 788
    .line 789
    invoke-virtual {v5, v3, v1}, Lo/y;->h(ILjava/lang/Object;)V

    .line 790
    .line 791
    .line 792
    :cond_1c
    if-eqz v2, :cond_1d

    .line 793
    .line 794
    iget-object v5, v13, Lj2/d0;->t:Lo/y;

    .line 795
    .line 796
    invoke-virtual {v5, v3, v2}, Lo/y;->h(ILjava/lang/Object;)V

    .line 797
    .line 798
    .line 799
    :cond_1d
    invoke-virtual {v13, v4}, Lj2/d0;->w(Li2/j0;)V

    .line 800
    .line 801
    .line 802
    :cond_1e
    :goto_11
    if-eqz v1, :cond_1f

    .line 803
    .line 804
    iget-object v1, v1, Lq2/i;->a:Ljc/m;

    .line 805
    .line 806
    invoke-interface {v1}, Lic/a;->b()Ljava/lang/Object;

    .line 807
    .line 808
    .line 809
    move-result-object v1

    .line 810
    check-cast v1, Ljava/lang/Float;

    .line 811
    .line 812
    iput-object v1, v14, Lj2/s2;->c:Ljava/lang/Float;

    .line 813
    .line 814
    :cond_1f
    if-eqz v2, :cond_20

    .line 815
    .line 816
    iget-object v1, v2, Lq2/i;->a:Ljc/m;

    .line 817
    .line 818
    invoke-interface {v1}, Lic/a;->b()Ljava/lang/Object;

    .line 819
    .line 820
    .line 821
    move-result-object v1

    .line 822
    check-cast v1, Ljava/lang/Float;

    .line 823
    .line 824
    iput-object v1, v14, Lj2/s2;->d:Ljava/lang/Float;

    .line 825
    .line 826
    :cond_20
    return-object v12

    .line 827
    :pswitch_b
    check-cast v14, Lj2/v;

    .line 828
    .line 829
    check-cast v13, Landroid/view/KeyEvent;

    .line 830
    .line 831
    invoke-static {v14, v13}, Lj2/v;->c(Lj2/v;Landroid/view/KeyEvent;)Z

    .line 832
    .line 833
    .line 834
    move-result v1

    .line 835
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 836
    .line 837
    .line 838
    move-result-object v1

    .line 839
    return-object v1

    .line 840
    :pswitch_c
    check-cast v14, Li2/v0;

    .line 841
    .line 842
    iget-object v1, v14, Li2/v0;->f:Li2/n0;

    .line 843
    .line 844
    iput v6, v1, Li2/n0;->h:I

    .line 845
    .line 846
    iget-object v2, v1, Li2/n0;->a:Li2/j0;

    .line 847
    .line 848
    invoke-virtual {v2}, Li2/j0;->z()Lz0/e;

    .line 849
    .line 850
    .line 851
    move-result-object v2

    .line 852
    iget-object v3, v2, Lz0/e;->a:[Ljava/lang/Object;

    .line 853
    .line 854
    iget v2, v2, Lz0/e;->c:I

    .line 855
    .line 856
    const/4 v4, 0x0

    .line 857
    :goto_12
    const v5, 0x7fffffff

    .line 858
    .line 859
    .line 860
    if-ge v4, v2, :cond_22

    .line 861
    .line 862
    aget-object v7, v3, v4

    .line 863
    .line 864
    check-cast v7, Li2/j0;

    .line 865
    .line 866
    iget-object v7, v7, Li2/j0;->G:Li2/n0;

    .line 867
    .line 868
    iget-object v7, v7, Li2/n0;->q:Li2/v0;

    .line 869
    .line 870
    invoke-static {v7}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 871
    .line 872
    .line 873
    iget v8, v7, Li2/v0;->i:I

    .line 874
    .line 875
    iput v8, v7, Li2/v0;->h:I

    .line 876
    .line 877
    iput v5, v7, Li2/v0;->i:I

    .line 878
    .line 879
    iget-object v5, v7, Li2/v0;->j:Li2/h0;

    .line 880
    .line 881
    sget-object v8, Li2/h0;->b:Li2/h0;

    .line 882
    .line 883
    if-ne v5, v8, :cond_21

    .line 884
    .line 885
    sget-object v5, Li2/h0;->c:Li2/h0;

    .line 886
    .line 887
    iput-object v5, v7, Li2/v0;->j:Li2/h0;

    .line 888
    .line 889
    :cond_21
    add-int/lit8 v4, v4, 0x1

    .line 890
    .line 891
    goto :goto_12

    .line 892
    :cond_22
    iget-object v2, v1, Li2/n0;->a:Li2/j0;

    .line 893
    .line 894
    iget-object v1, v1, Li2/n0;->a:Li2/j0;

    .line 895
    .line 896
    invoke-virtual {v2}, Li2/j0;->z()Lz0/e;

    .line 897
    .line 898
    .line 899
    move-result-object v2

    .line 900
    iget-object v3, v2, Lz0/e;->a:[Ljava/lang/Object;

    .line 901
    .line 902
    iget v2, v2, Lz0/e;->c:I

    .line 903
    .line 904
    const/4 v4, 0x0

    .line 905
    :goto_13
    if-ge v4, v2, :cond_23

    .line 906
    .line 907
    aget-object v7, v3, v4

    .line 908
    .line 909
    check-cast v7, Li2/j0;

    .line 910
    .line 911
    iget-object v7, v7, Li2/j0;->G:Li2/n0;

    .line 912
    .line 913
    iget-object v7, v7, Li2/n0;->q:Li2/v0;

    .line 914
    .line 915
    invoke-static {v7}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 916
    .line 917
    .line 918
    iget-object v7, v7, Li2/v0;->s:Li2/k0;

    .line 919
    .line 920
    iput-boolean v6, v7, Li2/k0;->d:Z

    .line 921
    .line 922
    add-int/lit8 v4, v4, 0x1

    .line 923
    .line 924
    goto :goto_13

    .line 925
    :cond_23
    invoke-virtual {v14}, Li2/v0;->d()Li2/u;

    .line 926
    .line 927
    .line 928
    move-result-object v2

    .line 929
    iget-object v2, v2, Li2/u;->S:Li2/t;

    .line 930
    .line 931
    if-eqz v2, :cond_25

    .line 932
    .line 933
    iget-boolean v2, v2, Li2/q0;->k:Z

    .line 934
    .line 935
    invoke-virtual {v1}, Li2/j0;->n()Ljava/util/List;

    .line 936
    .line 937
    .line 938
    move-result-object v3

    .line 939
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 940
    .line 941
    .line 942
    move-result v4

    .line 943
    const/4 v7, 0x0

    .line 944
    :goto_14
    if-ge v7, v4, :cond_25

    .line 945
    .line 946
    move-object v8, v3

    .line 947
    check-cast v8, Lz0/b;

    .line 948
    .line 949
    invoke-virtual {v8, v7}, Lz0/b;->get(I)Ljava/lang/Object;

    .line 950
    .line 951
    .line 952
    move-result-object v8

    .line 953
    check-cast v8, Li2/j0;

    .line 954
    .line 955
    iget-object v8, v8, Li2/j0;->F:Li2/d1;

    .line 956
    .line 957
    iget-object v8, v8, Li2/d1;->d:Li2/g1;

    .line 958
    .line 959
    invoke-virtual {v8}, Li2/g1;->K0()Li2/r0;

    .line 960
    .line 961
    .line 962
    move-result-object v8

    .line 963
    if-eqz v8, :cond_24

    .line 964
    .line 965
    iput-boolean v2, v8, Li2/q0;->k:Z

    .line 966
    .line 967
    :cond_24
    add-int/lit8 v7, v7, 0x1

    .line 968
    .line 969
    goto :goto_14

    .line 970
    :cond_25
    check-cast v13, Li2/r0;

    .line 971
    .line 972
    invoke-virtual {v13}, Li2/r0;->u0()Lg2/w0;

    .line 973
    .line 974
    .line 975
    move-result-object v2

    .line 976
    invoke-interface {v2}, Lg2/w0;->j()V

    .line 977
    .line 978
    .line 979
    invoke-virtual {v14}, Li2/v0;->d()Li2/u;

    .line 980
    .line 981
    .line 982
    move-result-object v2

    .line 983
    iget-object v2, v2, Li2/u;->S:Li2/t;

    .line 984
    .line 985
    if-eqz v2, :cond_27

    .line 986
    .line 987
    invoke-virtual {v1}, Li2/j0;->n()Ljava/util/List;

    .line 988
    .line 989
    .line 990
    move-result-object v2

    .line 991
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 992
    .line 993
    .line 994
    move-result v3

    .line 995
    const/4 v4, 0x0

    .line 996
    :goto_15
    if-ge v4, v3, :cond_27

    .line 997
    .line 998
    move-object v7, v2

    .line 999
    check-cast v7, Lz0/b;

    .line 1000
    .line 1001
    invoke-virtual {v7, v4}, Lz0/b;->get(I)Ljava/lang/Object;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v7

    .line 1005
    check-cast v7, Li2/j0;

    .line 1006
    .line 1007
    iget-object v7, v7, Li2/j0;->F:Li2/d1;

    .line 1008
    .line 1009
    iget-object v7, v7, Li2/d1;->d:Li2/g1;

    .line 1010
    .line 1011
    invoke-virtual {v7}, Li2/g1;->K0()Li2/r0;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v7

    .line 1015
    if-eqz v7, :cond_26

    .line 1016
    .line 1017
    iput-boolean v6, v7, Li2/q0;->k:Z

    .line 1018
    .line 1019
    :cond_26
    add-int/lit8 v4, v4, 0x1

    .line 1020
    .line 1021
    goto :goto_15

    .line 1022
    :cond_27
    invoke-virtual {v1}, Li2/j0;->z()Lz0/e;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v2

    .line 1026
    iget-object v3, v2, Lz0/e;->a:[Ljava/lang/Object;

    .line 1027
    .line 1028
    iget v2, v2, Lz0/e;->c:I

    .line 1029
    .line 1030
    const/4 v4, 0x0

    .line 1031
    :goto_16
    if-ge v4, v2, :cond_29

    .line 1032
    .line 1033
    aget-object v7, v3, v4

    .line 1034
    .line 1035
    check-cast v7, Li2/j0;

    .line 1036
    .line 1037
    iget-object v7, v7, Li2/j0;->G:Li2/n0;

    .line 1038
    .line 1039
    iget-object v7, v7, Li2/n0;->q:Li2/v0;

    .line 1040
    .line 1041
    invoke-static {v7}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 1042
    .line 1043
    .line 1044
    iget v8, v7, Li2/v0;->h:I

    .line 1045
    .line 1046
    iget v9, v7, Li2/v0;->i:I

    .line 1047
    .line 1048
    if-eq v8, v9, :cond_28

    .line 1049
    .line 1050
    if-ne v9, v5, :cond_28

    .line 1051
    .line 1052
    invoke-virtual {v7, v11}, Li2/v0;->l0(Z)V

    .line 1053
    .line 1054
    .line 1055
    :cond_28
    add-int/lit8 v4, v4, 0x1

    .line 1056
    .line 1057
    goto :goto_16

    .line 1058
    :cond_29
    invoke-virtual {v1}, Li2/j0;->z()Lz0/e;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v1

    .line 1062
    iget-object v2, v1, Lz0/e;->a:[Ljava/lang/Object;

    .line 1063
    .line 1064
    iget v1, v1, Lz0/e;->c:I

    .line 1065
    .line 1066
    :goto_17
    if-ge v6, v1, :cond_2a

    .line 1067
    .line 1068
    aget-object v3, v2, v6

    .line 1069
    .line 1070
    check-cast v3, Li2/j0;

    .line 1071
    .line 1072
    iget-object v3, v3, Li2/j0;->G:Li2/n0;

    .line 1073
    .line 1074
    iget-object v3, v3, Li2/n0;->q:Li2/v0;

    .line 1075
    .line 1076
    invoke-static {v3}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 1077
    .line 1078
    .line 1079
    iget-object v3, v3, Li2/v0;->s:Li2/k0;

    .line 1080
    .line 1081
    iget-boolean v4, v3, Li2/k0;->d:Z

    .line 1082
    .line 1083
    iput-boolean v4, v3, Li2/k0;->e:Z

    .line 1084
    .line 1085
    add-int/lit8 v6, v6, 0x1

    .line 1086
    .line 1087
    goto :goto_17

    .line 1088
    :cond_2a
    return-object v12

    .line 1089
    :pswitch_d
    check-cast v14, Li2/j0;

    .line 1090
    .line 1091
    iget-object v1, v14, Li2/j0;->F:Li2/d1;

    .line 1092
    .line 1093
    check-cast v13, Ljc/y;

    .line 1094
    .line 1095
    iget-object v2, v1, Li2/d1;->f:Lj1/p;

    .line 1096
    .line 1097
    iget v2, v2, Lj1/p;->d:I

    .line 1098
    .line 1099
    and-int/lit8 v2, v2, 0x8

    .line 1100
    .line 1101
    if-eqz v2, :cond_35

    .line 1102
    .line 1103
    iget-object v1, v1, Li2/d1;->e:Li2/a2;

    .line 1104
    .line 1105
    :goto_18
    if-eqz v1, :cond_35

    .line 1106
    .line 1107
    iget v2, v1, Lj1/p;->c:I

    .line 1108
    .line 1109
    and-int/lit8 v2, v2, 0x8

    .line 1110
    .line 1111
    if-eqz v2, :cond_34

    .line 1112
    .line 1113
    move-object v2, v1

    .line 1114
    move-object v3, v7

    .line 1115
    :goto_19
    if-eqz v2, :cond_34

    .line 1116
    .line 1117
    instance-of v4, v2, Li2/y1;

    .line 1118
    .line 1119
    if-eqz v4, :cond_2d

    .line 1120
    .line 1121
    check-cast v2, Li2/y1;

    .line 1122
    .line 1123
    invoke-interface {v2}, Li2/y1;->A()Z

    .line 1124
    .line 1125
    .line 1126
    move-result v4

    .line 1127
    if-eqz v4, :cond_2b

    .line 1128
    .line 1129
    new-instance v4, Lq2/k;

    .line 1130
    .line 1131
    invoke-direct {v4}, Lq2/k;-><init>()V

    .line 1132
    .line 1133
    .line 1134
    iput-object v4, v13, Ljc/y;->a:Ljava/lang/Object;

    .line 1135
    .line 1136
    iput-boolean v11, v4, Lq2/k;->d:Z

    .line 1137
    .line 1138
    :cond_2b
    invoke-interface {v2}, Li2/y1;->k0()Z

    .line 1139
    .line 1140
    .line 1141
    move-result v4

    .line 1142
    if-eqz v4, :cond_2c

    .line 1143
    .line 1144
    iget-object v4, v13, Ljc/y;->a:Ljava/lang/Object;

    .line 1145
    .line 1146
    check-cast v4, Lq2/k;

    .line 1147
    .line 1148
    iput-boolean v11, v4, Lq2/k;->c:Z

    .line 1149
    .line 1150
    :cond_2c
    iget-object v4, v13, Ljc/y;->a:Ljava/lang/Object;

    .line 1151
    .line 1152
    check-cast v4, Lq2/k;

    .line 1153
    .line 1154
    invoke-interface {v2, v4}, Li2/y1;->L(Lq2/k;)V

    .line 1155
    .line 1156
    .line 1157
    goto :goto_1c

    .line 1158
    :cond_2d
    iget v4, v2, Lj1/p;->c:I

    .line 1159
    .line 1160
    and-int/lit8 v4, v4, 0x8

    .line 1161
    .line 1162
    if-eqz v4, :cond_33

    .line 1163
    .line 1164
    instance-of v4, v2, Li2/n;

    .line 1165
    .line 1166
    if-eqz v4, :cond_33

    .line 1167
    .line 1168
    move-object v4, v2

    .line 1169
    check-cast v4, Li2/n;

    .line 1170
    .line 1171
    iget-object v4, v4, Li2/n;->p:Lj1/p;

    .line 1172
    .line 1173
    const/4 v5, 0x0

    .line 1174
    :goto_1a
    if-eqz v4, :cond_32

    .line 1175
    .line 1176
    iget v8, v4, Lj1/p;->c:I

    .line 1177
    .line 1178
    and-int/lit8 v8, v8, 0x8

    .line 1179
    .line 1180
    if-eqz v8, :cond_31

    .line 1181
    .line 1182
    add-int/lit8 v5, v5, 0x1

    .line 1183
    .line 1184
    if-ne v5, v11, :cond_2e

    .line 1185
    .line 1186
    move-object v2, v4

    .line 1187
    goto :goto_1b

    .line 1188
    :cond_2e
    if-nez v3, :cond_2f

    .line 1189
    .line 1190
    new-instance v3, Lz0/e;

    .line 1191
    .line 1192
    const/16 v8, 0x10

    .line 1193
    .line 1194
    new-array v8, v8, [Lj1/p;

    .line 1195
    .line 1196
    invoke-direct {v3, v8}, Lz0/e;-><init>([Ljava/lang/Object;)V

    .line 1197
    .line 1198
    .line 1199
    :cond_2f
    if-eqz v2, :cond_30

    .line 1200
    .line 1201
    invoke-virtual {v3, v2}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 1202
    .line 1203
    .line 1204
    move-object v2, v7

    .line 1205
    :cond_30
    invoke-virtual {v3, v4}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 1206
    .line 1207
    .line 1208
    :cond_31
    :goto_1b
    iget-object v4, v4, Lj1/p;->f:Lj1/p;

    .line 1209
    .line 1210
    goto :goto_1a

    .line 1211
    :cond_32
    if-ne v5, v11, :cond_33

    .line 1212
    .line 1213
    goto :goto_19

    .line 1214
    :cond_33
    :goto_1c
    invoke-static {v3}, Li2/f;->f(Lz0/e;)Lj1/p;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v2

    .line 1218
    goto :goto_19

    .line 1219
    :cond_34
    iget-object v1, v1, Lj1/p;->e:Lj1/p;

    .line 1220
    .line 1221
    goto :goto_18

    .line 1222
    :cond_35
    return-object v12

    .line 1223
    :pswitch_e
    check-cast v14, Ly2/y;

    .line 1224
    .line 1225
    iget-wide v1, v14, Ly2/y;->b:J

    .line 1226
    .line 1227
    check-cast v13, Lx0/w0;

    .line 1228
    .line 1229
    invoke-interface {v13}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v3

    .line 1233
    check-cast v3, Ly2/y;

    .line 1234
    .line 1235
    iget-wide v3, v3, Ly2/y;->b:J

    .line 1236
    .line 1237
    invoke-static {v1, v2, v3, v4}, Lt2/k0;->a(JJ)Z

    .line 1238
    .line 1239
    .line 1240
    move-result v1

    .line 1241
    if-eqz v1, :cond_36

    .line 1242
    .line 1243
    iget-object v1, v14, Ly2/y;->c:Lt2/k0;

    .line 1244
    .line 1245
    invoke-interface {v13}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v2

    .line 1249
    check-cast v2, Ly2/y;

    .line 1250
    .line 1251
    iget-object v2, v2, Ly2/y;->c:Lt2/k0;

    .line 1252
    .line 1253
    invoke-static {v1, v2}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1254
    .line 1255
    .line 1256
    move-result v1

    .line 1257
    if-nez v1, :cond_37

    .line 1258
    .line 1259
    :cond_36
    invoke-interface {v13, v14}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 1260
    .line 1261
    .line 1262
    :cond_37
    return-object v12

    .line 1263
    :pswitch_f
    check-cast v14, Lx0/c0;

    .line 1264
    .line 1265
    invoke-virtual {v14}, Lx0/c0;->getValue()Ljava/lang/Object;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v1

    .line 1269
    check-cast v1, Ld0/s;

    .line 1270
    .line 1271
    new-instance v2, Lah/j;

    .line 1272
    .line 1273
    check-cast v13, Ld0/d;

    .line 1274
    .line 1275
    iget-object v3, v13, Ld0/f0;->d:Ld0/y;

    .line 1276
    .line 1277
    iget-object v3, v3, Ld0/y;->f:Ljava/lang/Object;

    .line 1278
    .line 1279
    check-cast v3, Lb0/u0;

    .line 1280
    .line 1281
    invoke-virtual {v3}, Lb0/u0;->getValue()Ljava/lang/Object;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v3

    .line 1285
    check-cast v3, Loc/d;

    .line 1286
    .line 1287
    invoke-direct {v2, v3, v1}, Lah/j;-><init>(Loc/d;Lb0/g0;)V

    .line 1288
    .line 1289
    .line 1290
    new-instance v3, Ld0/t;

    .line 1291
    .line 1292
    invoke-direct {v3, v13, v1, v2}, Ld0/t;-><init>(Ld0/d;Ld0/s;Lah/j;)V

    .line 1293
    .line 1294
    .line 1295
    return-object v3

    .line 1296
    :pswitch_10
    check-cast v14, Lc2/d;

    .line 1297
    .line 1298
    check-cast v13, Lj1/p;

    .line 1299
    .line 1300
    invoke-virtual {v14, v13}, Lc2/d;->g(Lj1/p;)V

    .line 1301
    .line 1302
    .line 1303
    return-object v12

    .line 1304
    :pswitch_11
    check-cast v14, Lx0/c0;

    .line 1305
    .line 1306
    invoke-virtual {v14}, Lx0/c0;->getValue()Ljava/lang/Object;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v1

    .line 1310
    check-cast v1, Lc0/f;

    .line 1311
    .line 1312
    new-instance v2, Lah/j;

    .line 1313
    .line 1314
    check-cast v13, Lc0/z;

    .line 1315
    .line 1316
    iget-object v3, v13, Lc0/z;->c:Lc0/s;

    .line 1317
    .line 1318
    iget-object v3, v3, Lc0/s;->h:Ljava/lang/Object;

    .line 1319
    .line 1320
    check-cast v3, Lb0/u0;

    .line 1321
    .line 1322
    invoke-virtual {v3}, Lb0/u0;->getValue()Ljava/lang/Object;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v3

    .line 1326
    check-cast v3, Loc/d;

    .line 1327
    .line 1328
    invoke-direct {v2, v3, v1}, Lah/j;-><init>(Loc/d;Lb0/g0;)V

    .line 1329
    .line 1330
    .line 1331
    new-instance v3, Lc0/g;

    .line 1332
    .line 1333
    invoke-direct {v3, v13, v1, v2}, Lc0/g;-><init>(Lc0/z;Lc0/f;Lah/j;)V

    .line 1334
    .line 1335
    .line 1336
    return-object v3

    .line 1337
    :pswitch_12
    new-instance v1, Lb0/q1;

    .line 1338
    .line 1339
    check-cast v14, Lg1/g;

    .line 1340
    .line 1341
    sget-object v2, Lvb/s;->a:Lvb/s;

    .line 1342
    .line 1343
    check-cast v13, Lg1/c;

    .line 1344
    .line 1345
    invoke-direct {v1, v14, v2, v13}, Lb0/q1;-><init>(Lg1/g;Ljava/util/Map;Lg1/c;)V

    .line 1346
    .line 1347
    .line 1348
    return-object v1

    .line 1349
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
.end method
