.class public final Lm0/f;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lic/n;Lf1/f;Lf1/f;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lm0/f;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/f;->b:Ljava/lang/Object;

    iput-object p2, p0, Lm0/f;->d:Ljava/lang/Object;

    iput-object p3, p0, Lm0/f;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lic/n;I)V
    .locals 0

    .line 2
    iput p4, p0, Lm0/f;->a:I

    iput-object p1, p0, Lm0/f;->c:Ljava/lang/Object;

    iput-object p2, p0, Lm0/f;->d:Ljava/lang/Object;

    iput-object p3, p0, Lm0/f;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lic/o;I)V
    .locals 0

    .line 3
    iput p4, p0, Lm0/f;->a:I

    iput-object p1, p0, Lm0/f;->b:Ljava/lang/Object;

    iput-object p2, p0, Lm0/f;->c:Ljava/lang/Object;

    iput-object p3, p0, Lm0/f;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lm0/f;->a:I

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    sget-object v3, Lj1/n;->a:Lj1/n;

    .line 7
    .line 8
    sget-object v4, Lub/a0;->a:Lub/a0;

    .line 9
    .line 10
    iget-object v5, v0, Lm0/f;->c:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v6, v0, Lm0/f;->d:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v7, 0x2

    .line 15
    const/4 v8, 0x0

    .line 16
    iget-object v9, v0, Lm0/f;->b:Ljava/lang/Object;

    .line 17
    .line 18
    const/4 v10, 0x1

    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object/from16 v1, p1

    .line 23
    .line 24
    check-cast v1, Lx0/o;

    .line 25
    .line 26
    move-object/from16 v2, p2

    .line 27
    .line 28
    check-cast v2, Ljava/lang/Number;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    check-cast v9, Lic/n;

    .line 35
    .line 36
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    and-int/lit8 v11, v2, 0x3

    .line 41
    .line 42
    if-eq v11, v7, :cond_0

    .line 43
    .line 44
    const/4 v7, 0x1

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 v7, 0x0

    .line 47
    :goto_0
    and-int/2addr v2, v10

    .line 48
    invoke-virtual {v1, v2, v7}, Lx0/o;->N(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    if-eqz v9, :cond_1

    .line 55
    .line 56
    const v2, -0x47eb6658

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v2}, Lx0/o;->W(I)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v9, v1, v3}, Lic/n;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    :goto_1
    invoke-virtual {v1, v8}, Lx0/o;->p(Z)V

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_1
    const v2, 0x4a7ecfe8    # 4174842.0f

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v2}, Lx0/o;->W(I)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :goto_2
    check-cast v6, Lf1/f;

    .line 77
    .line 78
    invoke-virtual {v6, v1, v3}, Lf1/f;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    check-cast v5, Lf1/f;

    .line 82
    .line 83
    invoke-virtual {v5, v1, v3}, Lf1/f;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_2
    invoke-virtual {v1}, Lx0/o;->Q()V

    .line 88
    .line 89
    .line 90
    :goto_3
    return-object v4

    .line 91
    :pswitch_0
    move-object/from16 v1, p1

    .line 92
    .line 93
    check-cast v1, Lx0/o;

    .line 94
    .line 95
    move-object/from16 v2, p2

    .line 96
    .line 97
    check-cast v2, Ljava/lang/Number;

    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    and-int/lit8 v11, v2, 0x3

    .line 104
    .line 105
    if-eq v11, v7, :cond_3

    .line 106
    .line 107
    const/4 v7, 0x1

    .line 108
    goto :goto_4

    .line 109
    :cond_3
    const/4 v7, 0x0

    .line 110
    :goto_4
    and-int/2addr v2, v10

    .line 111
    invoke-virtual {v1, v2, v7}, Lx0/o;->N(IZ)Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-eqz v2, :cond_8

    .line 116
    .line 117
    const-string v2, "border"

    .line 118
    .line 119
    invoke-static {v3, v2}, Landroidx/compose/ui/layout/a;->c(Lj1/q;Ljava/lang/Object;)Lj1/q;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    check-cast v5, Lx0/w0;

    .line 124
    .line 125
    invoke-interface {v5}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    check-cast v3, Lp1/e;

    .line 130
    .line 131
    iget-wide v11, v3, Lp1/e;->a:J

    .line 132
    .line 133
    check-cast v6, Ly/d1;

    .line 134
    .line 135
    sget v3, Lm0/a5;->a:F

    .line 136
    .line 137
    new-instance v3, Ld9/u;

    .line 138
    .line 139
    const/4 v5, 0x4

    .line 140
    invoke-direct {v3, v11, v12, v6, v5}, Ld9/u;-><init>(JLjava/lang/Object;I)V

    .line 141
    .line 142
    .line 143
    invoke-static {v2, v3}, Landroidx/compose/ui/draw/a;->c(Lj1/q;Lic/k;)Lj1/q;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    check-cast v9, Lic/n;

    .line 148
    .line 149
    sget-object v3, Lj1/c;->a:Lj1/h;

    .line 150
    .line 151
    invoke-static {v3, v10}, Ly/p;->d(Lj1/h;Z)Lg2/v0;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    invoke-static {v1}, Lx0/v;->q(Lx0/o;)I

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    invoke-virtual {v1}, Lx0/o;->l()Lx0/j1;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    invoke-static {v2, v1}, Lj1/a;->c(Lj1/q;Lx0/o;)Lj1/q;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    sget-object v7, Li2/k;->g0:Li2/j;

    .line 168
    .line 169
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    sget-object v7, Li2/j;->b:Li2/i;

    .line 173
    .line 174
    invoke-virtual {v1}, Lx0/o;->a0()V

    .line 175
    .line 176
    .line 177
    iget-boolean v11, v1, Lx0/o;->S:Z

    .line 178
    .line 179
    if-eqz v11, :cond_4

    .line 180
    .line 181
    invoke-virtual {v1, v7}, Lx0/o;->k(Lic/a;)V

    .line 182
    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_4
    invoke-virtual {v1}, Lx0/o;->k0()V

    .line 186
    .line 187
    .line 188
    :goto_5
    sget-object v7, Li2/j;->g:Li2/h;

    .line 189
    .line 190
    invoke-static {v7, v3, v1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 191
    .line 192
    .line 193
    sget-object v3, Li2/j;->f:Li2/h;

    .line 194
    .line 195
    invoke-static {v3, v6, v1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 196
    .line 197
    .line 198
    sget-object v3, Li2/j;->j:Li2/h;

    .line 199
    .line 200
    iget-boolean v6, v1, Lx0/o;->S:Z

    .line 201
    .line 202
    if-nez v6, :cond_5

    .line 203
    .line 204
    invoke-virtual {v1}, Lx0/o;->K()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object v7

    .line 212
    invoke-static {v6, v7}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v6

    .line 216
    if-nez v6, :cond_6

    .line 217
    .line 218
    :cond_5
    invoke-static {v5, v1, v5, v3}, Lj2/h0;->s(ILx0/o;ILi2/h;)V

    .line 219
    .line 220
    .line 221
    :cond_6
    sget-object v3, Li2/j;->d:Li2/h;

    .line 222
    .line 223
    invoke-static {v3, v2, v1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 224
    .line 225
    .line 226
    if-nez v9, :cond_7

    .line 227
    .line 228
    const v2, -0x4d3f14a3

    .line 229
    .line 230
    .line 231
    invoke-virtual {v1, v2}, Lx0/o;->W(I)V

    .line 232
    .line 233
    .line 234
    :goto_6
    invoke-virtual {v1, v8}, Lx0/o;->p(Z)V

    .line 235
    .line 236
    .line 237
    goto :goto_7

    .line 238
    :cond_7
    const v2, 0xe063924

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1, v2}, Lx0/o;->W(I)V

    .line 242
    .line 243
    .line 244
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    invoke-interface {v9, v1, v2}, Lic/n;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    goto :goto_6

    .line 252
    :goto_7
    invoke-virtual {v1, v10}, Lx0/o;->p(Z)V

    .line 253
    .line 254
    .line 255
    goto :goto_8

    .line 256
    :cond_8
    invoke-virtual {v1}, Lx0/o;->Q()V

    .line 257
    .line 258
    .line 259
    :goto_8
    return-object v4

    .line 260
    :pswitch_1
    move-object/from16 v1, p1

    .line 261
    .line 262
    check-cast v1, Lx0/o;

    .line 263
    .line 264
    move-object/from16 v3, p2

    .line 265
    .line 266
    check-cast v3, Ljava/lang/Number;

    .line 267
    .line 268
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 269
    .line 270
    .line 271
    move-result v3

    .line 272
    and-int/lit8 v11, v3, 0x3

    .line 273
    .line 274
    if-eq v11, v7, :cond_9

    .line 275
    .line 276
    const/4 v7, 0x1

    .line 277
    goto :goto_9

    .line 278
    :cond_9
    const/4 v7, 0x0

    .line 279
    :goto_9
    and-int/2addr v3, v10

    .line 280
    invoke-virtual {v1, v3, v7}, Lx0/o;->N(IZ)Z

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    if-eqz v3, :cond_d

    .line 285
    .line 286
    check-cast v9, Lj1/q;

    .line 287
    .line 288
    const/4 v3, 0x0

    .line 289
    sget v7, Lm0/f4;->d:F

    .line 290
    .line 291
    invoke-static {v9, v3, v7, v10}, Landroidx/compose/foundation/layout/a;->l(Lj1/q;FFI)Lj1/q;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    invoke-static {v3}, Landroidx/compose/foundation/layout/a;->p(Lj1/q;)Lj1/q;

    .line 296
    .line 297
    .line 298
    move-result-object v3

    .line 299
    check-cast v5, Ls/o1;

    .line 300
    .line 301
    invoke-static {v3, v5, v10}, Ln7/b0;->x(Lj1/q;Ls/o1;Z)Lj1/q;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    check-cast v6, Lf1/f;

    .line 306
    .line 307
    sget-object v5, Ly/k;->c:Ly/o0;

    .line 308
    .line 309
    sget-object v7, Lj1/c;->m:Lj1/f;

    .line 310
    .line 311
    invoke-static {v5, v7, v1, v8}, Ly/u;->a(Ly/h;Lj1/f;Lx0/o;I)Ly/v;

    .line 312
    .line 313
    .line 314
    move-result-object v5

    .line 315
    invoke-static {v1}, Lx0/v;->q(Lx0/o;)I

    .line 316
    .line 317
    .line 318
    move-result v7

    .line 319
    invoke-virtual {v1}, Lx0/o;->l()Lx0/j1;

    .line 320
    .line 321
    .line 322
    move-result-object v8

    .line 323
    invoke-static {v3, v1}, Lj1/a;->c(Lj1/q;Lx0/o;)Lj1/q;

    .line 324
    .line 325
    .line 326
    move-result-object v3

    .line 327
    sget-object v9, Li2/k;->g0:Li2/j;

    .line 328
    .line 329
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    sget-object v9, Li2/j;->b:Li2/i;

    .line 333
    .line 334
    invoke-virtual {v1}, Lx0/o;->a0()V

    .line 335
    .line 336
    .line 337
    iget-boolean v11, v1, Lx0/o;->S:Z

    .line 338
    .line 339
    if-eqz v11, :cond_a

    .line 340
    .line 341
    invoke-virtual {v1, v9}, Lx0/o;->k(Lic/a;)V

    .line 342
    .line 343
    .line 344
    goto :goto_a

    .line 345
    :cond_a
    invoke-virtual {v1}, Lx0/o;->k0()V

    .line 346
    .line 347
    .line 348
    :goto_a
    sget-object v9, Li2/j;->g:Li2/h;

    .line 349
    .line 350
    invoke-static {v9, v5, v1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 351
    .line 352
    .line 353
    sget-object v5, Li2/j;->f:Li2/h;

    .line 354
    .line 355
    invoke-static {v5, v8, v1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 356
    .line 357
    .line 358
    sget-object v5, Li2/j;->j:Li2/h;

    .line 359
    .line 360
    iget-boolean v8, v1, Lx0/o;->S:Z

    .line 361
    .line 362
    if-nez v8, :cond_b

    .line 363
    .line 364
    invoke-virtual {v1}, Lx0/o;->K()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v8

    .line 368
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 369
    .line 370
    .line 371
    move-result-object v9

    .line 372
    invoke-static {v8, v9}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    move-result v8

    .line 376
    if-nez v8, :cond_c

    .line 377
    .line 378
    :cond_b
    invoke-static {v7, v1, v7, v5}, Lj2/h0;->s(ILx0/o;ILi2/h;)V

    .line 379
    .line 380
    .line 381
    :cond_c
    sget-object v5, Li2/j;->d:Li2/h;

    .line 382
    .line 383
    invoke-static {v5, v3, v1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 384
    .line 385
    .line 386
    sget-object v3, Ly/w;->a:Ly/w;

    .line 387
    .line 388
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    invoke-virtual {v6, v3, v1, v2}, Lf1/f;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v1, v10}, Lx0/o;->p(Z)V

    .line 396
    .line 397
    .line 398
    goto :goto_b

    .line 399
    :cond_d
    invoke-virtual {v1}, Lx0/o;->Q()V

    .line 400
    .line 401
    .line 402
    :goto_b
    return-object v4

    .line 403
    :pswitch_2
    move-object/from16 v1, p1

    .line 404
    .line 405
    check-cast v1, Lx0/o;

    .line 406
    .line 407
    move-object/from16 v2, p2

    .line 408
    .line 409
    check-cast v2, Ljava/lang/Number;

    .line 410
    .line 411
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 412
    .line 413
    .line 414
    move-result v2

    .line 415
    and-int/lit8 v3, v2, 0x3

    .line 416
    .line 417
    if-eq v3, v7, :cond_e

    .line 418
    .line 419
    const/4 v3, 0x1

    .line 420
    goto :goto_c

    .line 421
    :cond_e
    const/4 v3, 0x0

    .line 422
    :goto_c
    and-int/2addr v2, v10

    .line 423
    invoke-virtual {v1, v2, v3}, Lx0/o;->N(IZ)Z

    .line 424
    .line 425
    .line 426
    move-result v2

    .line 427
    if-eqz v2, :cond_f

    .line 428
    .line 429
    move-object v10, v5

    .line 430
    check-cast v10, Lt2/l0;

    .line 431
    .line 432
    move-object/from16 v25, v6

    .line 433
    .line 434
    check-cast v25, Le3/i;

    .line 435
    .line 436
    const v26, 0xefffff

    .line 437
    .line 438
    .line 439
    const-wide/16 v11, 0x0

    .line 440
    .line 441
    const-wide/16 v13, 0x0

    .line 442
    .line 443
    const/4 v15, 0x0

    .line 444
    const/16 v16, 0x0

    .line 445
    .line 446
    const/16 v17, 0x0

    .line 447
    .line 448
    const-wide/16 v18, 0x0

    .line 449
    .line 450
    const/16 v20, 0x0

    .line 451
    .line 452
    const/16 v21, 0x0

    .line 453
    .line 454
    const-wide/16 v22, 0x0

    .line 455
    .line 456
    const/16 v24, 0x0

    .line 457
    .line 458
    invoke-static/range {v10 .. v26}, Lt2/l0;->a(Lt2/l0;JJLx2/k;Lx2/i;Lx2/n;JLq1/k0;Ls1/h;JLt2/w;Le3/i;I)Lt2/l0;

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    check-cast v9, Lic/n;

    .line 463
    .line 464
    invoke-static {v2, v9, v1, v8}, Lm0/z8;->a(Lt2/l0;Lic/n;Lx0/o;I)V

    .line 465
    .line 466
    .line 467
    goto :goto_d

    .line 468
    :cond_f
    invoke-virtual {v1}, Lx0/o;->Q()V

    .line 469
    .line 470
    .line 471
    :goto_d
    return-object v4

    .line 472
    :pswitch_3
    move-object/from16 v1, p1

    .line 473
    .line 474
    check-cast v1, Lx0/o;

    .line 475
    .line 476
    move-object/from16 v2, p2

    .line 477
    .line 478
    check-cast v2, Ljava/lang/Number;

    .line 479
    .line 480
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 481
    .line 482
    .line 483
    move-result v2

    .line 484
    and-int/lit8 v3, v2, 0x3

    .line 485
    .line 486
    if-eq v3, v7, :cond_10

    .line 487
    .line 488
    const/4 v8, 0x1

    .line 489
    :cond_10
    and-int/2addr v2, v10

    .line 490
    invoke-virtual {v1, v2, v8}, Lx0/o;->N(IZ)Z

    .line 491
    .line 492
    .line 493
    move-result v2

    .line 494
    if-eqz v2, :cond_11

    .line 495
    .line 496
    sget-object v2, Lm0/h1;->a:Lx0/z;

    .line 497
    .line 498
    check-cast v9, Lx0/w0;

    .line 499
    .line 500
    invoke-interface {v9}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v3

    .line 504
    check-cast v3, Lq1/q;

    .line 505
    .line 506
    iget-wide v7, v3, Lq1/q;->a:J

    .line 507
    .line 508
    invoke-static {v7, v8}, Lq1/q;->d(J)F

    .line 509
    .line 510
    .line 511
    move-result v3

    .line 512
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 513
    .line 514
    .line 515
    move-result-object v3

    .line 516
    invoke-virtual {v2, v3}, Lx0/z;->a(Ljava/lang/Object;)Lx0/n1;

    .line 517
    .line 518
    .line 519
    move-result-object v2

    .line 520
    new-instance v3, Lm0/u0;

    .line 521
    .line 522
    check-cast v5, Ly/d1;

    .line 523
    .line 524
    check-cast v6, Lic/o;

    .line 525
    .line 526
    invoke-direct {v3, v5, v6, v10}, Lm0/u0;-><init>(Ly/d1;Lic/o;I)V

    .line 527
    .line 528
    .line 529
    const v5, -0x33da2ede    # -4.346791E7f

    .line 530
    .line 531
    .line 532
    invoke-static {v5, v3, v1}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 533
    .line 534
    .line 535
    move-result-object v3

    .line 536
    const/16 v5, 0x38

    .line 537
    .line 538
    invoke-static {v2, v3, v1, v5}, Lx0/v;->a(Lx0/n1;Lic/n;Lx0/o;I)V

    .line 539
    .line 540
    .line 541
    goto :goto_e

    .line 542
    :cond_11
    invoke-virtual {v1}, Lx0/o;->Q()V

    .line 543
    .line 544
    .line 545
    :goto_e
    return-object v4

    .line 546
    :pswitch_4
    move-object/from16 v1, p1

    .line 547
    .line 548
    check-cast v1, Lx0/o;

    .line 549
    .line 550
    move-object/from16 v11, p2

    .line 551
    .line 552
    check-cast v11, Ljava/lang/Number;

    .line 553
    .line 554
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 555
    .line 556
    .line 557
    move-result v11

    .line 558
    and-int/lit8 v12, v11, 0x3

    .line 559
    .line 560
    if-eq v12, v7, :cond_12

    .line 561
    .line 562
    const/4 v7, 0x1

    .line 563
    goto :goto_f

    .line 564
    :cond_12
    const/4 v7, 0x0

    .line 565
    :goto_f
    and-int/2addr v11, v10

    .line 566
    invoke-virtual {v1, v11, v7}, Lx0/o;->N(IZ)Z

    .line 567
    .line 568
    .line 569
    move-result v7

    .line 570
    if-eqz v7, :cond_18

    .line 571
    .line 572
    check-cast v9, Lic/n;

    .line 573
    .line 574
    check-cast v5, Lic/n;

    .line 575
    .line 576
    check-cast v6, Lf1/f;

    .line 577
    .line 578
    sget-object v7, Ly/k;->c:Ly/o0;

    .line 579
    .line 580
    sget-object v11, Lj1/c;->m:Lj1/f;

    .line 581
    .line 582
    invoke-static {v7, v11, v1, v8}, Ly/u;->a(Ly/h;Lj1/f;Lx0/o;I)Ly/v;

    .line 583
    .line 584
    .line 585
    move-result-object v7

    .line 586
    invoke-static {v1}, Lx0/v;->q(Lx0/o;)I

    .line 587
    .line 588
    .line 589
    move-result v11

    .line 590
    invoke-virtual {v1}, Lx0/o;->l()Lx0/j1;

    .line 591
    .line 592
    .line 593
    move-result-object v12

    .line 594
    invoke-static {v3, v1}, Lj1/a;->c(Lj1/q;Lx0/o;)Lj1/q;

    .line 595
    .line 596
    .line 597
    move-result-object v3

    .line 598
    sget-object v13, Li2/k;->g0:Li2/j;

    .line 599
    .line 600
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 601
    .line 602
    .line 603
    sget-object v13, Li2/j;->b:Li2/i;

    .line 604
    .line 605
    invoke-virtual {v1}, Lx0/o;->a0()V

    .line 606
    .line 607
    .line 608
    iget-boolean v14, v1, Lx0/o;->S:Z

    .line 609
    .line 610
    if-eqz v14, :cond_13

    .line 611
    .line 612
    invoke-virtual {v1, v13}, Lx0/o;->k(Lic/a;)V

    .line 613
    .line 614
    .line 615
    goto :goto_10

    .line 616
    :cond_13
    invoke-virtual {v1}, Lx0/o;->k0()V

    .line 617
    .line 618
    .line 619
    :goto_10
    sget-object v13, Li2/j;->g:Li2/h;

    .line 620
    .line 621
    invoke-static {v13, v7, v1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 622
    .line 623
    .line 624
    sget-object v7, Li2/j;->f:Li2/h;

    .line 625
    .line 626
    invoke-static {v7, v12, v1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 627
    .line 628
    .line 629
    sget-object v7, Li2/j;->j:Li2/h;

    .line 630
    .line 631
    iget-boolean v12, v1, Lx0/o;->S:Z

    .line 632
    .line 633
    if-nez v12, :cond_14

    .line 634
    .line 635
    invoke-virtual {v1}, Lx0/o;->K()Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v12

    .line 639
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 640
    .line 641
    .line 642
    move-result-object v13

    .line 643
    invoke-static {v12, v13}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 644
    .line 645
    .line 646
    move-result v12

    .line 647
    if-nez v12, :cond_15

    .line 648
    .line 649
    :cond_14
    invoke-static {v11, v1, v11, v7}, Lj2/h0;->s(ILx0/o;ILi2/h;)V

    .line 650
    .line 651
    .line 652
    :cond_15
    sget-object v7, Li2/j;->d:Li2/h;

    .line 653
    .line 654
    invoke-static {v7, v3, v1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 655
    .line 656
    .line 657
    const/4 v3, 0x0

    .line 658
    if-nez v9, :cond_16

    .line 659
    .line 660
    const v7, -0x5d6e349

    .line 661
    .line 662
    .line 663
    invoke-virtual {v1, v7}, Lx0/o;->W(I)V

    .line 664
    .line 665
    .line 666
    invoke-virtual {v1, v8}, Lx0/o;->p(Z)V

    .line 667
    .line 668
    .line 669
    move-object v7, v3

    .line 670
    goto :goto_11

    .line 671
    :cond_16
    const v7, -0x5d6e348

    .line 672
    .line 673
    .line 674
    invoke-virtual {v1, v7}, Lx0/o;->W(I)V

    .line 675
    .line 676
    .line 677
    new-instance v7, Lm0/e;

    .line 678
    .line 679
    invoke-direct {v7, v10, v9}, Lm0/e;-><init>(ILic/n;)V

    .line 680
    .line 681
    .line 682
    const v9, 0x6790e913

    .line 683
    .line 684
    .line 685
    invoke-static {v9, v7, v1}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 686
    .line 687
    .line 688
    move-result-object v7

    .line 689
    invoke-virtual {v1, v8}, Lx0/o;->p(Z)V

    .line 690
    .line 691
    .line 692
    :goto_11
    if-nez v5, :cond_17

    .line 693
    .line 694
    const v5, -0x5d07504

    .line 695
    .line 696
    .line 697
    invoke-virtual {v1, v5}, Lx0/o;->W(I)V

    .line 698
    .line 699
    .line 700
    :goto_12
    invoke-virtual {v1, v8}, Lx0/o;->p(Z)V

    .line 701
    .line 702
    .line 703
    goto :goto_13

    .line 704
    :cond_17
    const v3, -0x5d07503

    .line 705
    .line 706
    .line 707
    invoke-virtual {v1, v3}, Lx0/o;->W(I)V

    .line 708
    .line 709
    .line 710
    new-instance v3, Lm0/e;

    .line 711
    .line 712
    const/4 v9, 0x3

    .line 713
    invoke-direct {v3, v9, v5}, Lm0/e;-><init>(ILic/n;)V

    .line 714
    .line 715
    .line 716
    const v5, 0x4b6ecd32    # 1.5650098E7f

    .line 717
    .line 718
    .line 719
    invoke-static {v5, v3, v1}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 720
    .line 721
    .line 722
    move-result-object v3

    .line 723
    goto :goto_12

    .line 724
    :goto_13
    invoke-static {v7, v3, v1, v2}, Lm0/k;->a(Lic/n;Lic/n;Lx0/o;I)V

    .line 725
    .line 726
    .line 727
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 728
    .line 729
    .line 730
    move-result-object v2

    .line 731
    invoke-virtual {v6, v1, v2}, Lf1/f;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 732
    .line 733
    .line 734
    invoke-virtual {v1, v10}, Lx0/o;->p(Z)V

    .line 735
    .line 736
    .line 737
    goto :goto_14

    .line 738
    :cond_18
    invoke-virtual {v1}, Lx0/o;->Q()V

    .line 739
    .line 740
    .line 741
    :goto_14
    return-object v4

    .line 742
    nop

    .line 743
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
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
