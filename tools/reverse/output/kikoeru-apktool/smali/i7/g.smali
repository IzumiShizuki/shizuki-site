.class public final Li7/g;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Llf/g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Llf/g;


# direct methods
.method public synthetic constructor <init>(Llf/g;I)V
    .locals 0

    .line 1
    iput p2, p0, Li7/g;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Li7/g;->b:Llf/g;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
.end method


# virtual methods
.method public final n(Ljava/lang/Object;Lyb/c;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget v3, v0, Li7/g;->a:I

    .line 8
    .line 9
    sget-object v4, Lt8/b;->q:Lt8/b;

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v6, 0x0

    .line 13
    sget-object v7, Lub/a0;->a:Lub/a0;

    .line 14
    .line 15
    iget-object v8, v0, Li7/g;->b:Llf/g;

    .line 16
    .line 17
    const-string v9, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    sget-object v10, Lzb/a;->a:Lzb/a;

    .line 20
    .line 21
    const/high16 v11, -0x80000000

    .line 22
    .line 23
    const/4 v12, 0x1

    .line 24
    packed-switch v3, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    instance-of v3, v2, Lo9/a;

    .line 28
    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    move-object v3, v2

    .line 32
    check-cast v3, Lo9/a;

    .line 33
    .line 34
    iget v4, v3, Lo9/a;->e:I

    .line 35
    .line 36
    and-int v13, v4, v11

    .line 37
    .line 38
    if-eqz v13, :cond_0

    .line 39
    .line 40
    sub-int/2addr v4, v11

    .line 41
    iput v4, v3, Lo9/a;->e:I

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    new-instance v3, Lo9/a;

    .line 45
    .line 46
    invoke-direct {v3, v0, v2}, Lo9/a;-><init>(Li7/g;Lyb/c;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    iget-object v2, v3, Lo9/a;->d:Ljava/lang/Object;

    .line 50
    .line 51
    iget v4, v3, Lo9/a;->e:I

    .line 52
    .line 53
    if-eqz v4, :cond_2

    .line 54
    .line 55
    if-ne v4, v12, :cond_1

    .line 56
    .line 57
    invoke-static {v2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    invoke-direct {v1, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v1

    .line 67
    :cond_2
    invoke-static {v2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    check-cast v1, Li7/l1;

    .line 71
    .line 72
    new-instance v2, Li7/a;

    .line 73
    .line 74
    const/4 v4, 0x6

    .line 75
    invoke-direct {v2, v5, v6, v4}, Li7/a;-><init>(ILyb/c;I)V

    .line 76
    .line 77
    .line 78
    invoke-static {v1, v2}, Li7/u;->c(Li7/l1;Lic/n;)Li7/l1;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    iput v12, v3, Lo9/a;->e:I

    .line 83
    .line 84
    invoke-interface {v8, v1, v3}, Llf/g;->n(Ljava/lang/Object;Lyb/c;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    if-ne v1, v10, :cond_3

    .line 89
    .line 90
    move-object v7, v10

    .line 91
    :cond_3
    :goto_1
    return-object v7

    .line 92
    :pswitch_0
    instance-of v3, v2, Ln9/d;

    .line 93
    .line 94
    if-eqz v3, :cond_4

    .line 95
    .line 96
    move-object v3, v2

    .line 97
    check-cast v3, Ln9/d;

    .line 98
    .line 99
    iget v4, v3, Ln9/d;->e:I

    .line 100
    .line 101
    and-int v13, v4, v11

    .line 102
    .line 103
    if-eqz v13, :cond_4

    .line 104
    .line 105
    sub-int/2addr v4, v11

    .line 106
    iput v4, v3, Ln9/d;->e:I

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_4
    new-instance v3, Ln9/d;

    .line 110
    .line 111
    invoke-direct {v3, v0, v2}, Ln9/d;-><init>(Li7/g;Lyb/c;)V

    .line 112
    .line 113
    .line 114
    :goto_2
    iget-object v2, v3, Ln9/d;->d:Ljava/lang/Object;

    .line 115
    .line 116
    iget v4, v3, Ln9/d;->e:I

    .line 117
    .line 118
    if-eqz v4, :cond_6

    .line 119
    .line 120
    if-ne v4, v12, :cond_5

    .line 121
    .line 122
    invoke-static {v2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 127
    .line 128
    invoke-direct {v1, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw v1

    .line 132
    :cond_6
    invoke-static {v2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    check-cast v1, Li7/l1;

    .line 136
    .line 137
    new-instance v2, Li7/a;

    .line 138
    .line 139
    const/4 v4, 0x4

    .line 140
    invoke-direct {v2, v5, v6, v4}, Li7/a;-><init>(ILyb/c;I)V

    .line 141
    .line 142
    .line 143
    invoke-static {v1, v2}, Li7/u;->c(Li7/l1;Lic/n;)Li7/l1;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    iput v12, v3, Ln9/d;->e:I

    .line 148
    .line 149
    invoke-interface {v8, v1, v3}, Llf/g;->n(Ljava/lang/Object;Lyb/c;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    if-ne v1, v10, :cond_7

    .line 154
    .line 155
    move-object v7, v10

    .line 156
    :cond_7
    :goto_3
    return-object v7

    .line 157
    :pswitch_1
    instance-of v3, v2, Lm9/l;

    .line 158
    .line 159
    if-eqz v3, :cond_8

    .line 160
    .line 161
    move-object v3, v2

    .line 162
    check-cast v3, Lm9/l;

    .line 163
    .line 164
    iget v4, v3, Lm9/l;->e:I

    .line 165
    .line 166
    and-int v5, v4, v11

    .line 167
    .line 168
    if-eqz v5, :cond_8

    .line 169
    .line 170
    sub-int/2addr v4, v11

    .line 171
    iput v4, v3, Lm9/l;->e:I

    .line 172
    .line 173
    goto :goto_4

    .line 174
    :cond_8
    new-instance v3, Lm9/l;

    .line 175
    .line 176
    invoke-direct {v3, v0, v2}, Lm9/l;-><init>(Li7/g;Lyb/c;)V

    .line 177
    .line 178
    .line 179
    :goto_4
    iget-object v2, v3, Lm9/l;->d:Ljava/lang/Object;

    .line 180
    .line 181
    iget v4, v3, Lm9/l;->e:I

    .line 182
    .line 183
    if-eqz v4, :cond_a

    .line 184
    .line 185
    if-ne v4, v12, :cond_9

    .line 186
    .line 187
    invoke-static {v2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    goto :goto_5

    .line 191
    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 192
    .line 193
    invoke-direct {v1, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    throw v1

    .line 197
    :cond_a
    invoke-static {v2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    check-cast v1, Ljava/lang/String;

    .line 201
    .line 202
    invoke-static {v1}, Lef/n;->X0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    new-array v2, v12, [C

    .line 211
    .line 212
    const/16 v4, 0x2f

    .line 213
    .line 214
    const/4 v5, 0x0

    .line 215
    aput-char v4, v2, v5

    .line 216
    .line 217
    invoke-static {v1, v2}, Lef/n;->Y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    iput v12, v3, Lm9/l;->e:I

    .line 222
    .line 223
    invoke-interface {v8, v1, v3}, Llf/g;->n(Ljava/lang/Object;Lyb/c;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    if-ne v1, v10, :cond_b

    .line 228
    .line 229
    move-object v7, v10

    .line 230
    :cond_b
    :goto_5
    return-object v7

    .line 231
    :pswitch_2
    instance-of v3, v2, Lm0/q7;

    .line 232
    .line 233
    if-eqz v3, :cond_c

    .line 234
    .line 235
    move-object v3, v2

    .line 236
    check-cast v3, Lm0/q7;

    .line 237
    .line 238
    iget v4, v3, Lm0/q7;->e:I

    .line 239
    .line 240
    and-int v5, v4, v11

    .line 241
    .line 242
    if-eqz v5, :cond_c

    .line 243
    .line 244
    sub-int/2addr v4, v11

    .line 245
    iput v4, v3, Lm0/q7;->e:I

    .line 246
    .line 247
    goto :goto_6

    .line 248
    :cond_c
    new-instance v3, Lm0/q7;

    .line 249
    .line 250
    invoke-direct {v3, v0, v2}, Lm0/q7;-><init>(Li7/g;Lyb/c;)V

    .line 251
    .line 252
    .line 253
    :goto_6
    iget-object v2, v3, Lm0/q7;->d:Ljava/lang/Object;

    .line 254
    .line 255
    iget v4, v3, Lm0/q7;->e:I

    .line 256
    .line 257
    if-eqz v4, :cond_e

    .line 258
    .line 259
    if-ne v4, v12, :cond_d

    .line 260
    .line 261
    invoke-static {v2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    goto :goto_7

    .line 265
    :cond_d
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 266
    .line 267
    invoke-direct {v1, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    throw v1

    .line 271
    :cond_e
    invoke-static {v2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    move-object v2, v1

    .line 275
    check-cast v2, Ljava/util/Map;

    .line 276
    .line 277
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 278
    .line 279
    .line 280
    move-result v2

    .line 281
    if-nez v2, :cond_f

    .line 282
    .line 283
    iput v12, v3, Lm0/q7;->e:I

    .line 284
    .line 285
    invoke-interface {v8, v1, v3}, Llf/g;->n(Ljava/lang/Object;Lyb/c;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    if-ne v1, v10, :cond_f

    .line 290
    .line 291
    move-object v7, v10

    .line 292
    :cond_f
    :goto_7
    return-object v7

    .line 293
    :pswitch_3
    instance-of v3, v2, Llf/e0;

    .line 294
    .line 295
    if-eqz v3, :cond_10

    .line 296
    .line 297
    move-object v3, v2

    .line 298
    check-cast v3, Llf/e0;

    .line 299
    .line 300
    iget v4, v3, Llf/e0;->e:I

    .line 301
    .line 302
    and-int v5, v4, v11

    .line 303
    .line 304
    if-eqz v5, :cond_10

    .line 305
    .line 306
    sub-int/2addr v4, v11

    .line 307
    iput v4, v3, Llf/e0;->e:I

    .line 308
    .line 309
    goto :goto_8

    .line 310
    :cond_10
    new-instance v3, Llf/e0;

    .line 311
    .line 312
    invoke-direct {v3, v0, v2}, Llf/e0;-><init>(Li7/g;Lyb/c;)V

    .line 313
    .line 314
    .line 315
    :goto_8
    iget-object v2, v3, Llf/e0;->d:Ljava/lang/Object;

    .line 316
    .line 317
    iget v4, v3, Llf/e0;->e:I

    .line 318
    .line 319
    if-eqz v4, :cond_12

    .line 320
    .line 321
    if-ne v4, v12, :cond_11

    .line 322
    .line 323
    invoke-static {v2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    goto :goto_9

    .line 327
    :cond_11
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 328
    .line 329
    invoke-direct {v1, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    throw v1

    .line 333
    :cond_12
    invoke-static {v2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    if-eqz v1, :cond_13

    .line 337
    .line 338
    iput v12, v3, Llf/e0;->e:I

    .line 339
    .line 340
    invoke-interface {v8, v1, v3}, Llf/g;->n(Ljava/lang/Object;Lyb/c;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    if-ne v1, v10, :cond_13

    .line 345
    .line 346
    move-object v7, v10

    .line 347
    :cond_13
    :goto_9
    return-object v7

    .line 348
    :pswitch_4
    instance-of v3, v2, Li8/q;

    .line 349
    .line 350
    if-eqz v3, :cond_14

    .line 351
    .line 352
    move-object v3, v2

    .line 353
    check-cast v3, Li8/q;

    .line 354
    .line 355
    iget v5, v3, Li8/q;->e:I

    .line 356
    .line 357
    and-int v13, v5, v11

    .line 358
    .line 359
    if-eqz v13, :cond_14

    .line 360
    .line 361
    sub-int/2addr v5, v11

    .line 362
    iput v5, v3, Li8/q;->e:I

    .line 363
    .line 364
    goto :goto_a

    .line 365
    :cond_14
    new-instance v3, Li8/q;

    .line 366
    .line 367
    invoke-direct {v3, v0, v2}, Li8/q;-><init>(Li7/g;Lyb/c;)V

    .line 368
    .line 369
    .line 370
    :goto_a
    iget-object v2, v3, Li8/q;->d:Ljava/lang/Object;

    .line 371
    .line 372
    iget v5, v3, Li8/q;->e:I

    .line 373
    .line 374
    if-eqz v5, :cond_16

    .line 375
    .line 376
    if-ne v5, v12, :cond_15

    .line 377
    .line 378
    invoke-static {v2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    goto :goto_d

    .line 382
    :cond_15
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 383
    .line 384
    invoke-direct {v1, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    throw v1

    .line 388
    :cond_16
    invoke-static {v2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    check-cast v1, Lf3/a;

    .line 392
    .line 393
    iget-wide v1, v1, Lf3/a;->a:J

    .line 394
    .line 395
    sget-object v5, Li8/w;->b:Lt8/e;

    .line 396
    .line 397
    invoke-static {v1, v2}, Lf3/a;->k(J)Z

    .line 398
    .line 399
    .line 400
    move-result v5

    .line 401
    if-eqz v5, :cond_17

    .line 402
    .line 403
    goto :goto_c

    .line 404
    :cond_17
    invoke-static {v1, v2}, Lf3/a;->d(J)Z

    .line 405
    .line 406
    .line 407
    move-result v5

    .line 408
    if-eqz v5, :cond_18

    .line 409
    .line 410
    invoke-static {v1, v2}, Lf3/a;->h(J)I

    .line 411
    .line 412
    .line 413
    move-result v5

    .line 414
    new-instance v6, Lt8/a;

    .line 415
    .line 416
    invoke-direct {v6, v5}, Lt8/a;-><init>(I)V

    .line 417
    .line 418
    .line 419
    goto :goto_b

    .line 420
    :cond_18
    move-object v6, v4

    .line 421
    :goto_b
    invoke-static {v1, v2}, Lf3/a;->c(J)Z

    .line 422
    .line 423
    .line 424
    move-result v5

    .line 425
    if-eqz v5, :cond_19

    .line 426
    .line 427
    invoke-static {v1, v2}, Lf3/a;->g(J)I

    .line 428
    .line 429
    .line 430
    move-result v1

    .line 431
    new-instance v4, Lt8/a;

    .line 432
    .line 433
    invoke-direct {v4, v1}, Lt8/a;-><init>(I)V

    .line 434
    .line 435
    .line 436
    :cond_19
    new-instance v1, Lt8/h;

    .line 437
    .line 438
    invoke-direct {v1, v6, v4}, Lt8/h;-><init>(Lnh/a;Lnh/a;)V

    .line 439
    .line 440
    .line 441
    move-object v6, v1

    .line 442
    :goto_c
    if-eqz v6, :cond_1a

    .line 443
    .line 444
    iput v12, v3, Li8/q;->e:I

    .line 445
    .line 446
    invoke-interface {v8, v6, v3}, Llf/g;->n(Ljava/lang/Object;Lyb/c;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    if-ne v1, v10, :cond_1a

    .line 451
    .line 452
    move-object v7, v10

    .line 453
    :cond_1a
    :goto_d
    return-object v7

    .line 454
    :pswitch_5
    instance-of v3, v2, Li8/j;

    .line 455
    .line 456
    if-eqz v3, :cond_1b

    .line 457
    .line 458
    move-object v3, v2

    .line 459
    check-cast v3, Li8/j;

    .line 460
    .line 461
    iget v5, v3, Li8/j;->e:I

    .line 462
    .line 463
    and-int v13, v5, v11

    .line 464
    .line 465
    if-eqz v13, :cond_1b

    .line 466
    .line 467
    sub-int/2addr v5, v11

    .line 468
    iput v5, v3, Li8/j;->e:I

    .line 469
    .line 470
    goto :goto_e

    .line 471
    :cond_1b
    new-instance v3, Li8/j;

    .line 472
    .line 473
    invoke-direct {v3, v0, v2}, Li8/j;-><init>(Li7/g;Lyb/c;)V

    .line 474
    .line 475
    .line 476
    :goto_e
    iget-object v2, v3, Li8/j;->d:Ljava/lang/Object;

    .line 477
    .line 478
    iget v5, v3, Li8/j;->e:I

    .line 479
    .line 480
    if-eqz v5, :cond_1d

    .line 481
    .line 482
    if-ne v5, v12, :cond_1c

    .line 483
    .line 484
    invoke-static {v2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 485
    .line 486
    .line 487
    goto/16 :goto_11

    .line 488
    .line 489
    :cond_1c
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 490
    .line 491
    invoke-direct {v1, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    throw v1

    .line 495
    :cond_1d
    invoke-static {v2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 496
    .line 497
    .line 498
    check-cast v1, Lp1/e;

    .line 499
    .line 500
    iget-wide v1, v1, Lp1/e;->a:J

    .line 501
    .line 502
    const-wide v13, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    cmp-long v5, v1, v13

    .line 508
    .line 509
    if-nez v5, :cond_1e

    .line 510
    .line 511
    sget-object v6, Lt8/h;->c:Lt8/h;

    .line 512
    .line 513
    goto :goto_10

    .line 514
    :cond_1e
    sget-object v5, Li8/w;->b:Lt8/e;

    .line 515
    .line 516
    invoke-static {v1, v2}, Lp1/e;->d(J)F

    .line 517
    .line 518
    .line 519
    move-result v5

    .line 520
    float-to-double v13, v5

    .line 521
    const-wide/high16 v15, 0x3fe0000000000000L    # 0.5

    .line 522
    .line 523
    cmpl-double v5, v13, v15

    .line 524
    .line 525
    if-ltz v5, :cond_21

    .line 526
    .line 527
    invoke-static {v1, v2}, Lp1/e;->b(J)F

    .line 528
    .line 529
    .line 530
    move-result v5

    .line 531
    float-to-double v13, v5

    .line 532
    cmpl-double v5, v13, v15

    .line 533
    .line 534
    if-ltz v5, :cond_21

    .line 535
    .line 536
    new-instance v6, Lt8/h;

    .line 537
    .line 538
    invoke-static {v1, v2}, Lp1/e;->d(J)F

    .line 539
    .line 540
    .line 541
    move-result v5

    .line 542
    invoke-static {v5}, Ljava/lang/Float;->isInfinite(F)Z

    .line 543
    .line 544
    .line 545
    move-result v9

    .line 546
    if-nez v9, :cond_1f

    .line 547
    .line 548
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 549
    .line 550
    .line 551
    move-result v5

    .line 552
    if-nez v5, :cond_1f

    .line 553
    .line 554
    invoke-static {v1, v2}, Lp1/e;->d(J)F

    .line 555
    .line 556
    .line 557
    move-result v5

    .line 558
    invoke-static {v5}, Llc/b;->R(F)I

    .line 559
    .line 560
    .line 561
    move-result v5

    .line 562
    new-instance v9, Lt8/a;

    .line 563
    .line 564
    invoke-direct {v9, v5}, Lt8/a;-><init>(I)V

    .line 565
    .line 566
    .line 567
    goto :goto_f

    .line 568
    :cond_1f
    move-object v9, v4

    .line 569
    :goto_f
    invoke-static {v1, v2}, Lp1/e;->b(J)F

    .line 570
    .line 571
    .line 572
    move-result v5

    .line 573
    invoke-static {v5}, Ljava/lang/Float;->isInfinite(F)Z

    .line 574
    .line 575
    .line 576
    move-result v11

    .line 577
    if-nez v11, :cond_20

    .line 578
    .line 579
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 580
    .line 581
    .line 582
    move-result v5

    .line 583
    if-nez v5, :cond_20

    .line 584
    .line 585
    invoke-static {v1, v2}, Lp1/e;->b(J)F

    .line 586
    .line 587
    .line 588
    move-result v1

    .line 589
    invoke-static {v1}, Llc/b;->R(F)I

    .line 590
    .line 591
    .line 592
    move-result v1

    .line 593
    new-instance v4, Lt8/a;

    .line 594
    .line 595
    invoke-direct {v4, v1}, Lt8/a;-><init>(I)V

    .line 596
    .line 597
    .line 598
    :cond_20
    invoke-direct {v6, v9, v4}, Lt8/h;-><init>(Lnh/a;Lnh/a;)V

    .line 599
    .line 600
    .line 601
    :cond_21
    :goto_10
    if-eqz v6, :cond_22

    .line 602
    .line 603
    iput v12, v3, Li8/j;->e:I

    .line 604
    .line 605
    invoke-interface {v8, v6, v3}, Llf/g;->n(Ljava/lang/Object;Lyb/c;)Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v1

    .line 609
    if-ne v1, v10, :cond_22

    .line 610
    .line 611
    move-object v7, v10

    .line 612
    :cond_22
    :goto_11
    return-object v7

    .line 613
    :pswitch_6
    instance-of v3, v2, Li7/m;

    .line 614
    .line 615
    if-eqz v3, :cond_23

    .line 616
    .line 617
    move-object v3, v2

    .line 618
    check-cast v3, Li7/m;

    .line 619
    .line 620
    iget v4, v3, Li7/m;->e:I

    .line 621
    .line 622
    and-int v5, v4, v11

    .line 623
    .line 624
    if-eqz v5, :cond_23

    .line 625
    .line 626
    sub-int/2addr v4, v11

    .line 627
    iput v4, v3, Li7/m;->e:I

    .line 628
    .line 629
    goto :goto_12

    .line 630
    :cond_23
    new-instance v3, Li7/m;

    .line 631
    .line 632
    invoke-direct {v3, v0, v2}, Li7/m;-><init>(Li7/g;Lyb/c;)V

    .line 633
    .line 634
    .line 635
    :goto_12
    iget-object v2, v3, Li7/m;->d:Ljava/lang/Object;

    .line 636
    .line 637
    iget v4, v3, Li7/m;->e:I

    .line 638
    .line 639
    if-eqz v4, :cond_25

    .line 640
    .line 641
    if-ne v4, v12, :cond_24

    .line 642
    .line 643
    invoke-static {v2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 644
    .line 645
    .line 646
    goto :goto_13

    .line 647
    :cond_24
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 648
    .line 649
    invoke-direct {v1, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 650
    .line 651
    .line 652
    throw v1

    .line 653
    :cond_25
    invoke-static {v2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 654
    .line 655
    .line 656
    check-cast v1, Lub/k;

    .line 657
    .line 658
    iget-object v1, v1, Lub/k;->b:Ljava/lang/Object;

    .line 659
    .line 660
    if-eqz v1, :cond_26

    .line 661
    .line 662
    iput v12, v3, Li7/m;->e:I

    .line 663
    .line 664
    invoke-interface {v8, v1, v3}, Llf/g;->n(Ljava/lang/Object;Lyb/c;)Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v1

    .line 668
    if-ne v1, v10, :cond_26

    .line 669
    .line 670
    move-object v7, v10

    .line 671
    :cond_26
    :goto_13
    return-object v7

    .line 672
    :pswitch_7
    instance-of v3, v2, Li7/f;

    .line 673
    .line 674
    if-eqz v3, :cond_27

    .line 675
    .line 676
    move-object v3, v2

    .line 677
    check-cast v3, Li7/f;

    .line 678
    .line 679
    iget v4, v3, Li7/f;->e:I

    .line 680
    .line 681
    and-int v5, v4, v11

    .line 682
    .line 683
    if-eqz v5, :cond_27

    .line 684
    .line 685
    sub-int/2addr v4, v11

    .line 686
    iput v4, v3, Li7/f;->e:I

    .line 687
    .line 688
    goto :goto_14

    .line 689
    :cond_27
    new-instance v3, Li7/f;

    .line 690
    .line 691
    invoke-direct {v3, v0, v2}, Li7/f;-><init>(Li7/g;Lyb/c;)V

    .line 692
    .line 693
    .line 694
    :goto_14
    iget-object v2, v3, Li7/f;->d:Ljava/lang/Object;

    .line 695
    .line 696
    iget v4, v3, Li7/f;->e:I

    .line 697
    .line 698
    if-eqz v4, :cond_29

    .line 699
    .line 700
    if-ne v4, v12, :cond_28

    .line 701
    .line 702
    invoke-static {v2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 703
    .line 704
    .line 705
    goto :goto_15

    .line 706
    :cond_28
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 707
    .line 708
    invoke-direct {v1, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 709
    .line 710
    .line 711
    throw v1

    .line 712
    :cond_29
    invoke-static {v2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 713
    .line 714
    .line 715
    check-cast v1, Li7/e0;

    .line 716
    .line 717
    new-instance v2, Li7/l1;

    .line 718
    .line 719
    iget-object v4, v1, Li7/e0;->b:Lch/l;

    .line 720
    .line 721
    iget-object v4, v4, Lch/l;->f:Ljava/lang/Object;

    .line 722
    .line 723
    check-cast v4, Li7/n;

    .line 724
    .line 725
    new-instance v5, La9/k;

    .line 726
    .line 727
    const/4 v9, 0x5

    .line 728
    invoke-direct {v5, v9, v1, v6}, La9/k;-><init>(ILjava/lang/Object;Lyb/c;)V

    .line 729
    .line 730
    .line 731
    new-instance v9, Li7/v1;

    .line 732
    .line 733
    invoke-direct {v9, v5, v4}, Li7/v1;-><init>(Lic/n;Llf/f;)V

    .line 734
    .line 735
    .line 736
    new-instance v4, Le/i;

    .line 737
    .line 738
    invoke-direct {v4, v12, v1, v6}, Le/i;-><init>(ILjava/lang/Object;Lyb/c;)V

    .line 739
    .line 740
    .line 741
    new-instance v5, Llf/n;

    .line 742
    .line 743
    invoke-direct {v5, v9, v4}, Llf/n;-><init>(Llf/f;Lic/o;)V

    .line 744
    .line 745
    .line 746
    iget-object v4, v1, Li7/e0;->a:Li7/l1;

    .line 747
    .line 748
    iget-object v6, v4, Li7/l1;->b:Li7/r2;

    .line 749
    .line 750
    iget-object v4, v4, Li7/l1;->c:Lb0/c1;

    .line 751
    .line 752
    new-instance v9, Lb0/d0;

    .line 753
    .line 754
    const/16 v11, 0xf

    .line 755
    .line 756
    invoke-direct {v9, v11, v1}, Lb0/d0;-><init>(ILjava/lang/Object;)V

    .line 757
    .line 758
    .line 759
    invoke-direct {v2, v5, v6, v4, v9}, Li7/l1;-><init>(Llf/f;Li7/r2;Lb0/c1;Lic/a;)V

    .line 760
    .line 761
    .line 762
    iput v12, v3, Li7/f;->e:I

    .line 763
    .line 764
    invoke-interface {v8, v2, v3}, Llf/g;->n(Ljava/lang/Object;Lyb/c;)Ljava/lang/Object;

    .line 765
    .line 766
    .line 767
    move-result-object v1

    .line 768
    if-ne v1, v10, :cond_2a

    .line 769
    .line 770
    move-object v7, v10

    .line 771
    :cond_2a
    :goto_15
    return-object v7

    .line 772
    nop

    .line 773
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
.end method
