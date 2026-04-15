.class public final Landroid/support/v4/media/a;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroid/support/v4/media/a;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Landroid/support/v4/media/a;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    new-instance v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;-><init>(Landroid/os/Parcel;)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 27
    .line 28
    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 29
    .line 30
    .line 31
    :goto_0
    if-ge v3, v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-static {v4}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-static {v5}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    add-int/lit8 v3, v3, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    new-instance p1, Lq8/b;

    .line 54
    .line 55
    invoke-direct {p1, v2, v0}, Lq8/b;-><init>(Ljava/util/Map;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object p1

    .line 59
    :pswitch_1
    new-instance v0, Lcom/tencent/bugly/crashreport/common/info/PlugInBean;

    .line 60
    .line 61
    invoke-direct {v0, p1}, Lcom/tencent/bugly/crashreport/common/info/PlugInBean;-><init>(Landroid/os/Parcel;)V

    .line 62
    .line 63
    .line 64
    return-object v0

    .line 65
    :pswitch_2
    new-instance v0, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;

    .line 66
    .line 67
    invoke-direct {v0, p1}, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;-><init>(Landroid/os/Parcel;)V

    .line 68
    .line 69
    .line 70
    return-object v0

    .line 71
    :pswitch_3
    new-instance v0, Lm7/j0;

    .line 72
    .line 73
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    iput v1, v0, Lm7/j0;->a:I

    .line 81
    .line 82
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    iput v1, v0, Lm7/j0;->b:I

    .line 87
    .line 88
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    iput v1, v0, Lm7/j0;->c:I

    .line 93
    .line 94
    if-lez v1, :cond_1

    .line 95
    .line 96
    new-array v1, v1, [I

    .line 97
    .line 98
    iput-object v1, v0, Lm7/j0;->d:[I

    .line 99
    .line 100
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readIntArray([I)V

    .line 101
    .line 102
    .line 103
    :cond_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    iput v1, v0, Lm7/j0;->e:I

    .line 108
    .line 109
    if-lez v1, :cond_2

    .line 110
    .line 111
    new-array v1, v1, [I

    .line 112
    .line 113
    iput-object v1, v0, Lm7/j0;->f:[I

    .line 114
    .line 115
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readIntArray([I)V

    .line 116
    .line 117
    .line 118
    :cond_2
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-ne v1, v2, :cond_3

    .line 123
    .line 124
    const/4 v1, 0x1

    .line 125
    goto :goto_1

    .line 126
    :cond_3
    const/4 v1, 0x0

    .line 127
    :goto_1
    iput-boolean v1, v0, Lm7/j0;->h:Z

    .line 128
    .line 129
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-ne v1, v2, :cond_4

    .line 134
    .line 135
    const/4 v1, 0x1

    .line 136
    goto :goto_2

    .line 137
    :cond_4
    const/4 v1, 0x0

    .line 138
    :goto_2
    iput-boolean v1, v0, Lm7/j0;->i:Z

    .line 139
    .line 140
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-ne v1, v2, :cond_5

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_5
    const/4 v2, 0x0

    .line 148
    :goto_3
    iput-boolean v2, v0, Lm7/j0;->j:Z

    .line 149
    .line 150
    const-class v1, Lm7/i0;

    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    iput-object p1, v0, Lm7/j0;->g:Ljava/util/ArrayList;

    .line 161
    .line 162
    return-object v0

    .line 163
    :pswitch_4
    new-instance v0, Lm7/i0;

    .line 164
    .line 165
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    iput v1, v0, Lm7/i0;->a:I

    .line 173
    .line 174
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    iput v1, v0, Lm7/i0;->b:I

    .line 179
    .line 180
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    if-ne v1, v2, :cond_6

    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_6
    const/4 v2, 0x0

    .line 188
    :goto_4
    iput-boolean v2, v0, Lm7/i0;->d:Z

    .line 189
    .line 190
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    if-lez v1, :cond_7

    .line 195
    .line 196
    new-array v1, v1, [I

    .line 197
    .line 198
    iput-object v1, v0, Lm7/i0;->c:[I

    .line 199
    .line 200
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readIntArray([I)V

    .line 201
    .line 202
    .line 203
    :cond_7
    return-object v0

    .line 204
    :pswitch_5
    new-instance v0, Lm7/k;

    .line 205
    .line 206
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    iput v1, v0, Lm7/k;->a:I

    .line 214
    .line 215
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    iput v1, v0, Lm7/k;->b:I

    .line 220
    .line 221
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 222
    .line 223
    .line 224
    move-result p1

    .line 225
    if-ne p1, v2, :cond_8

    .line 226
    .line 227
    goto :goto_5

    .line 228
    :cond_8
    const/4 v2, 0x0

    .line 229
    :goto_5
    iput-boolean v2, v0, Lm7/k;->c:Z

    .line 230
    .line 231
    return-object v0

    .line 232
    :pswitch_6
    new-instance v0, Li5/c;

    .line 233
    .line 234
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 235
    .line 236
    .line 237
    move-result p1

    .line 238
    invoke-direct {v0, p1}, Li5/c;-><init>(I)V

    .line 239
    .line 240
    .line 241
    return-object v0

    .line 242
    :pswitch_7
    new-instance v0, Landroidx/versionedparcelable/ParcelImpl;

    .line 243
    .line 244
    invoke-direct {v0, p1}, Landroidx/versionedparcelable/ParcelImpl;-><init>(Landroid/os/Parcel;)V

    .line 245
    .line 246
    .line 247
    return-object v0

    .line 248
    :pswitch_8
    const-string v0, "inParcel"

    .line 249
    .line 250
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    new-instance v0, Lg/e;

    .line 254
    .line 255
    invoke-direct {v0, p1}, Lg/e;-><init>(Landroid/os/Parcel;)V

    .line 256
    .line 257
    .line 258
    return-object v0

    .line 259
    :pswitch_9
    const-string v0, "parcel"

    .line 260
    .line 261
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    new-instance v0, Lg/a;

    .line 265
    .line 266
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    if-nez v3, :cond_9

    .line 275
    .line 276
    goto :goto_6

    .line 277
    :cond_9
    sget-object v1, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 278
    .line 279
    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    move-object v1, p1

    .line 284
    check-cast v1, Landroid/content/Intent;

    .line 285
    .line 286
    :goto_6
    invoke-direct {v0, v1, v2}, Lg/a;-><init>(Landroid/content/Intent;I)V

    .line 287
    .line 288
    .line 289
    return-object v0

    .line 290
    :pswitch_a
    new-instance v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    .line 291
    .line 292
    invoke-direct {v0, p1}, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;-><init>(Landroid/os/Parcel;)V

    .line 293
    .line 294
    .line 295
    return-object v0

    .line 296
    :pswitch_b
    new-instance v0, Lc7/q1;

    .line 297
    .line 298
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    .line 303
    .line 304
    .line 305
    move-result p1

    .line 306
    invoke-direct {v0, p1, v1}, Lc7/q1;-><init>(FI)V

    .line 307
    .line 308
    .line 309
    return-object v0

    .line 310
    :pswitch_c
    new-instance v0, Lc7/o1;

    .line 311
    .line 312
    invoke-direct {v0, p1}, Lc7/o1;-><init>(Landroid/os/Parcel;)V

    .line 313
    .line 314
    .line 315
    return-object v0

    .line 316
    :pswitch_d
    new-instance v0, Lc7/p1;

    .line 317
    .line 318
    invoke-direct {v0, p1}, Lc7/p1;-><init>(Landroid/os/Parcel;)V

    .line 319
    .line 320
    .line 321
    return-object v0

    .line 322
    :pswitch_e
    new-instance v0, Lc7/m1;

    .line 323
    .line 324
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 325
    .line 326
    .line 327
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 328
    .line 329
    .line 330
    move-result v1

    .line 331
    iput v1, v0, Lc7/m1;->a:I

    .line 332
    .line 333
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 334
    .line 335
    .line 336
    move-result v1

    .line 337
    iput v1, v0, Lc7/m1;->c:I

    .line 338
    .line 339
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 340
    .line 341
    .line 342
    move-result v1

    .line 343
    iput v1, v0, Lc7/m1;->d:I

    .line 344
    .line 345
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 346
    .line 347
    .line 348
    move-result v1

    .line 349
    iput v1, v0, Lc7/m1;->e:I

    .line 350
    .line 351
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 352
    .line 353
    .line 354
    move-result p1

    .line 355
    iput p1, v0, Lc7/m1;->b:I

    .line 356
    .line 357
    return-object v0

    .line 358
    :pswitch_f
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 359
    .line 360
    .line 361
    move-result-object p1

    .line 362
    new-instance v0, Lc7/d1;

    .line 363
    .line 364
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    invoke-direct {v0, p1, v1}, Lc7/d1;-><init>(Ljava/lang/Object;Lc7/h;)V

    .line 368
    .line 369
    .line 370
    return-object v0

    .line 371
    :pswitch_10
    new-instance v0, Lc7/c1;

    .line 372
    .line 373
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 374
    .line 375
    .line 376
    sget-object v1, Landroid/os/ResultReceiver;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 377
    .line 378
    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object p1

    .line 382
    check-cast p1, Landroid/os/ResultReceiver;

    .line 383
    .line 384
    iput-object p1, v0, Lc7/c1;->a:Landroid/os/ResultReceiver;

    .line 385
    .line 386
    return-object v0

    .line 387
    :pswitch_11
    new-instance v0, Lc7/b1;

    .line 388
    .line 389
    invoke-direct {v0, p1}, Lc7/b1;-><init>(Landroid/os/Parcel;)V

    .line 390
    .line 391
    .line 392
    return-object v0

    .line 393
    :pswitch_12
    new-instance v0, Lc7/r0;

    .line 394
    .line 395
    invoke-direct {v0, p1}, Lc7/r0;-><init>(Landroid/os/Parcel;)V

    .line 396
    .line 397
    .line 398
    return-object v0

    .line 399
    :pswitch_13
    sget-object v0, Landroid/media/MediaDescription;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 400
    .line 401
    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object p1

    .line 405
    invoke-static {p1}, Lc7/q0;->a(Ljava/lang/Object;)Lc7/q0;

    .line 406
    .line 407
    .line 408
    move-result-object p1

    .line 409
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    return-object p1

    .line 413
    :pswitch_14
    new-instance v0, Lc7/m;

    .line 414
    .line 415
    invoke-direct {v0, p1}, Lc7/m;-><init>(Landroid/os/Parcel;)V

    .line 416
    .line 417
    .line 418
    return-object v0

    .line 419
    :pswitch_15
    new-instance v0, Lc/d;

    .line 420
    .line 421
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 422
    .line 423
    .line 424
    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 425
    .line 426
    .line 427
    move-result-object p1

    .line 428
    sget v2, Lc/c;->f:I

    .line 429
    .line 430
    if-nez p1, :cond_a

    .line 431
    .line 432
    goto :goto_7

    .line 433
    :cond_a
    sget-object v1, Lc/b;->b:Ljava/lang/String;

    .line 434
    .line 435
    invoke-interface {p1, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    if-eqz v1, :cond_b

    .line 440
    .line 441
    instance-of v2, v1, Lc/b;

    .line 442
    .line 443
    if-eqz v2, :cond_b

    .line 444
    .line 445
    check-cast v1, Lc/b;

    .line 446
    .line 447
    goto :goto_7

    .line 448
    :cond_b
    new-instance v1, Lc/a;

    .line 449
    .line 450
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 451
    .line 452
    .line 453
    iput-object p1, v1, Lc/a;->e:Landroid/os/IBinder;

    .line 454
    .line 455
    :goto_7
    iput-object v1, v0, Lc/d;->a:Lc/b;

    .line 456
    .line 457
    return-object v0

    .line 458
    :pswitch_16
    new-instance v0, Landroidx/media3/exoplayer/offline/o;

    .line 459
    .line 460
    invoke-direct {v0, p1}, Landroidx/media3/exoplayer/offline/o;-><init>(Landroid/os/Parcel;)V

    .line 461
    .line 462
    .line 463
    return-object v0

    .line 464
    :pswitch_17
    new-instance v0, Landroid/support/v4/media/RatingCompat;

    .line 465
    .line 466
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 467
    .line 468
    .line 469
    move-result v1

    .line 470
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    .line 471
    .line 472
    .line 473
    move-result p1

    .line 474
    invoke-direct {v0, p1, v1}, Landroid/support/v4/media/RatingCompat;-><init>(FI)V

    .line 475
    .line 476
    .line 477
    return-object v0

    .line 478
    :pswitch_18
    new-instance v0, Landroid/support/v4/media/MediaMetadataCompat;

    .line 479
    .line 480
    invoke-direct {v0, p1}, Landroid/support/v4/media/MediaMetadataCompat;-><init>(Landroid/os/Parcel;)V

    .line 481
    .line 482
    .line 483
    return-object v0

    .line 484
    :pswitch_19
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 485
    .line 486
    sget-object v2, Landroid/media/MediaDescription;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 487
    .line 488
    invoke-interface {v2, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object p1

    .line 492
    if-eqz p1, :cond_12

    .line 493
    .line 494
    check-cast p1, Landroid/media/MediaDescription;

    .line 495
    .line 496
    invoke-static {p1}, Landroid/support/v4/media/b;->g(Landroid/media/MediaDescription;)Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v3

    .line 500
    invoke-static {p1}, Landroid/support/v4/media/b;->i(Landroid/media/MediaDescription;)Ljava/lang/CharSequence;

    .line 501
    .line 502
    .line 503
    move-result-object v4

    .line 504
    invoke-static {p1}, Landroid/support/v4/media/b;->h(Landroid/media/MediaDescription;)Ljava/lang/CharSequence;

    .line 505
    .line 506
    .line 507
    move-result-object v5

    .line 508
    invoke-static {p1}, Landroid/support/v4/media/b;->c(Landroid/media/MediaDescription;)Ljava/lang/CharSequence;

    .line 509
    .line 510
    .line 511
    move-result-object v6

    .line 512
    invoke-static {p1}, Landroid/support/v4/media/b;->e(Landroid/media/MediaDescription;)Landroid/graphics/Bitmap;

    .line 513
    .line 514
    .line 515
    move-result-object v7

    .line 516
    invoke-static {p1}, Landroid/support/v4/media/b;->f(Landroid/media/MediaDescription;)Landroid/net/Uri;

    .line 517
    .line 518
    .line 519
    move-result-object v8

    .line 520
    invoke-static {p1}, Landroid/support/v4/media/b;->d(Landroid/media/MediaDescription;)Landroid/os/Bundle;

    .line 521
    .line 522
    .line 523
    move-result-object v2

    .line 524
    if-eqz v2, :cond_c

    .line 525
    .line 526
    invoke-static {v2}, Landroid/support/v4/media/session/b;->b0(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 527
    .line 528
    .line 529
    move-result-object v2

    .line 530
    :cond_c
    const-string v9, "android.support.v4.media.description.MEDIA_URI"

    .line 531
    .line 532
    if-eqz v2, :cond_d

    .line 533
    .line 534
    invoke-virtual {v2, v9}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 535
    .line 536
    .line 537
    move-result-object v10

    .line 538
    check-cast v10, Landroid/net/Uri;

    .line 539
    .line 540
    goto :goto_8

    .line 541
    :cond_d
    move-object v10, v1

    .line 542
    :goto_8
    if-eqz v10, :cond_f

    .line 543
    .line 544
    const-string v11, "android.support.v4.media.description.NULL_BUNDLE_FLAG"

    .line 545
    .line 546
    invoke-virtual {v2, v11}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 547
    .line 548
    .line 549
    move-result v12

    .line 550
    if-eqz v12, :cond_e

    .line 551
    .line 552
    invoke-virtual {v2}, Landroid/os/BaseBundle;->size()I

    .line 553
    .line 554
    .line 555
    move-result v12

    .line 556
    const/4 v13, 0x2

    .line 557
    if-ne v12, v13, :cond_e

    .line 558
    .line 559
    move-object v9, v1

    .line 560
    goto :goto_9

    .line 561
    :cond_e
    invoke-virtual {v2, v9}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v2, v11}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 565
    .line 566
    .line 567
    :cond_f
    move-object v9, v2

    .line 568
    :goto_9
    if-eqz v10, :cond_10

    .line 569
    .line 570
    goto :goto_a

    .line 571
    :cond_10
    const/16 v2, 0x17

    .line 572
    .line 573
    if-lt v0, v2, :cond_11

    .line 574
    .line 575
    invoke-static {p1}, Landroid/support/v4/media/d;->a(Landroid/media/MediaDescription;)Landroid/net/Uri;

    .line 576
    .line 577
    .line 578
    move-result-object v1

    .line 579
    :cond_11
    move-object v10, v1

    .line 580
    :goto_a
    new-instance v2, Landroid/support/v4/media/MediaDescriptionCompat;

    .line 581
    .line 582
    invoke-direct/range {v2 .. v10}, Landroid/support/v4/media/MediaDescriptionCompat;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/os/Bundle;Landroid/net/Uri;)V

    .line 583
    .line 584
    .line 585
    iput-object p1, v2, Landroid/support/v4/media/MediaDescriptionCompat;->i:Landroid/media/MediaDescription;

    .line 586
    .line 587
    move-object v1, v2

    .line 588
    :cond_12
    return-object v1

    .line 589
    :pswitch_1a
    new-instance v0, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 590
    .line 591
    invoke-direct {v0, p1}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;-><init>(Landroid/os/Parcel;)V

    .line 592
    .line 593
    .line 594
    return-object v0

    .line 595
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
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
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
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
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Landroid/support/v4/media/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p1, p1, [Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 7
    .line 8
    return-object p1

    .line 9
    :pswitch_0
    new-array p1, p1, [Lq8/b;

    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_1
    new-array p1, p1, [Lcom/tencent/bugly/crashreport/common/info/PlugInBean;

    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_2
    new-array p1, p1, [Lcom/tencent/bugly/crashreport/biz/UserInfoBean;

    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_3
    new-array p1, p1, [Lm7/j0;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_4
    new-array p1, p1, [Lm7/i0;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_5
    new-array p1, p1, [Lm7/k;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_6
    new-array p1, p1, [Li5/c;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_7
    new-array p1, p1, [Landroidx/versionedparcelable/ParcelImpl;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_8
    new-array p1, p1, [Lg/e;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_9
    new-array p1, p1, [Lg/a;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_a
    new-array p1, p1, [Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_b
    new-array p1, p1, [Lc7/q1;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_c
    new-array p1, p1, [Lc7/o1;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_d
    new-array p1, p1, [Lc7/p1;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_e
    new-array p1, p1, [Lc7/m1;

    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_f
    new-array p1, p1, [Lc7/d1;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_10
    new-array p1, p1, [Lc7/c1;

    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_11
    new-array p1, p1, [Lc7/b1;

    .line 61
    .line 62
    return-object p1

    .line 63
    :pswitch_12
    new-array p1, p1, [Lc7/r0;

    .line 64
    .line 65
    return-object p1

    .line 66
    :pswitch_13
    new-array p1, p1, [Lc7/q0;

    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_14
    new-array p1, p1, [Lc7/m;

    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_15
    new-array p1, p1, [Lc/d;

    .line 73
    .line 74
    return-object p1

    .line 75
    :pswitch_16
    new-array p1, p1, [Landroidx/media3/exoplayer/offline/o;

    .line 76
    .line 77
    return-object p1

    .line 78
    :pswitch_17
    new-array p1, p1, [Landroid/support/v4/media/RatingCompat;

    .line 79
    .line 80
    return-object p1

    .line 81
    :pswitch_18
    new-array p1, p1, [Landroid/support/v4/media/MediaMetadataCompat;

    .line 82
    .line 83
    return-object p1

    .line 84
    :pswitch_19
    new-array p1, p1, [Landroid/support/v4/media/MediaDescriptionCompat;

    .line 85
    .line 86
    return-object p1

    .line 87
    :pswitch_1a
    new-array p1, p1, [Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 88
    .line 89
    return-object p1

    .line 90
    nop

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
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
