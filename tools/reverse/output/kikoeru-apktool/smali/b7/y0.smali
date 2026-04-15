.class public final synthetic Lb7/y0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lb7/o2;Lb7/e4;ILc7/k1;Lb7/n2;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lb7/y0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/y0;->c:Ljava/lang/Object;

    iput-object p2, p0, Lb7/y0;->d:Ljava/lang/Object;

    iput p3, p0, Lb7/y0;->b:I

    iput-object p4, p0, Lb7/y0;->e:Ljava/lang/Object;

    iput-object p5, p0, Lb7/y0;->f:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p6, p0, Lb7/y0;->a:I

    iput-object p1, p0, Lb7/y0;->c:Ljava/lang/Object;

    iput-object p2, p0, Lb7/y0;->d:Ljava/lang/Object;

    iput-object p3, p0, Lb7/y0;->e:Ljava/lang/Object;

    iput-object p4, p0, Lb7/y0;->f:Ljava/lang/Object;

    iput p5, p0, Lb7/y0;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 1
    iget v0, p0, Lb7/y0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb7/y0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lv4/q0;

    .line 9
    .line 10
    iget-object v1, p0, Lb7/y0;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroid/util/Pair;

    .line 13
    .line 14
    iget-object v2, p0, Lb7/y0;->e:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v6, v2

    .line 17
    check-cast v6, Lj5/u;

    .line 18
    .line 19
    iget-object v2, p0, Lb7/y0;->f:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v7, v2

    .line 22
    check-cast v7, Lj5/z;

    .line 23
    .line 24
    iget-object v0, v0, Lv4/q0;->b:Lv4/t0;

    .line 25
    .line 26
    iget-object v3, v0, Lv4/t0;->h:Lw4/d;

    .line 27
    .line 28
    iget-object v0, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    iget-object v0, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 37
    .line 38
    move-object v5, v0

    .line 39
    check-cast v5, Lj5/d0;

    .line 40
    .line 41
    iget v8, p0, Lb7/y0;->b:I

    .line 42
    .line 43
    invoke-virtual/range {v3 .. v8}, Lw4/d;->k(ILj5/d0;Lj5/u;Lj5/z;I)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_0
    iget-object v0, p0, Lb7/y0;->c:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Lb7/o2;

    .line 50
    .line 51
    iget-object v1, p0, Lb7/y0;->d:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, Lb7/e4;

    .line 54
    .line 55
    iget-object v2, p0, Lb7/y0;->e:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v2, Lc7/k1;

    .line 58
    .line 59
    iget-object v3, p0, Lb7/y0;->f:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v3, Lb7/n2;

    .line 62
    .line 63
    iget-object v4, v0, Lb7/o2;->f:Lb0/w1;

    .line 64
    .line 65
    iget-object v5, v0, Lb7/o2;->g:Lb7/c2;

    .line 66
    .line 67
    invoke-virtual {v5}, Lb7/c2;->h()Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v5, :cond_0

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_0
    iget-object v5, v0, Lb7/o2;->k:Lc7/e1;

    .line 75
    .line 76
    iget-object v5, v5, Lc7/e1;->b:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v5, Lc7/w0;

    .line 79
    .line 80
    iget-object v5, v5, Lc7/w0;->a:Landroid/media/session/MediaSession;

    .line 81
    .line 82
    invoke-virtual {v5}, Landroid/media/session/MediaSession;->isActive()Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    iget v6, p0, Lb7/y0;->b:I

    .line 87
    .line 88
    const-string v7, "MediaSessionLegacyStub"

    .line 89
    .line 90
    if-nez v5, :cond_2

    .line 91
    .line 92
    new-instance v0, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    const-string v3, "Ignore incoming session command before initialization. command="

    .line 95
    .line 96
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    if-nez v1, :cond_1

    .line 100
    .line 101
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    goto :goto_0

    .line 106
    :cond_1
    iget-object v1, v1, Lb7/e4;->b:Ljava/lang/String;

    .line 107
    .line 108
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string v1, ", pid="

    .line 112
    .line 113
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    iget-object v1, v2, Lc7/k1;->a:Lc7/j1;

    .line 117
    .line 118
    iget v1, v1, Lc7/j1;->b:I

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-static {v7, v0}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_2
    invoke-virtual {v0, v2}, Lb7/o2;->L(Lc7/k1;)Lb7/t1;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    if-eqz v1, :cond_3

    .line 136
    .line 137
    invoke-virtual {v4, v2, v1}, Lb0/w1;->W(Lb7/t1;Lb7/e4;)Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-nez v0, :cond_4

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_3
    invoke-virtual {v4, v2, v6}, Lb0/w1;->V(Lb7/t1;I)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-nez v0, :cond_4

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_4
    :try_start_0
    invoke-interface {v3, v2}, Lb7/n2;->b(Lb7/t1;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :catch_0
    move-exception v0

    .line 156
    new-instance v1, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    const-string v3, "Exception in "

    .line 159
    .line 160
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-static {v7, v1, v0}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 171
    .line 172
    .line 173
    :goto_1
    return-void

    .line 174
    :pswitch_1
    iget-object v0, p0, Lb7/y0;->c:Ljava/lang/Object;

    .line 175
    .line 176
    move-object v1, v0

    .line 177
    check-cast v1, Lb7/d1;

    .line 178
    .line 179
    iget-object v0, p0, Lb7/y0;->d:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 182
    .line 183
    iget-object v2, p0, Lb7/y0;->e:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v2, Ljava/util/List;

    .line 186
    .line 187
    iget-object v3, p0, Lb7/y0;->f:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v3, Ljava/util/ArrayList;

    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    if-ne v0, v4, :cond_7

    .line 200
    .line 201
    const/4 v0, 0x0

    .line 202
    const/4 v4, 0x0

    .line 203
    :goto_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    if-ge v4, v0, :cond_7

    .line 208
    .line 209
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    check-cast v0, Lcb/y;

    .line 214
    .line 215
    if-eqz v0, :cond_5

    .line 216
    .line 217
    :try_start_1
    invoke-static {v0}, Lg8/a;->B(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    check-cast v0, Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1

    .line 222
    .line 223
    goto :goto_4

    .line 224
    :catch_1
    move-exception v0

    .line 225
    goto :goto_3

    .line 226
    :catch_2
    move-exception v0

    .line 227
    :goto_3
    const-string v5, "MCImplLegacy"

    .line 228
    .line 229
    const-string v6, "Failed to get bitmap"

    .line 230
    .line 231
    invoke-static {v5, v6, v0}, Lp4/c;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 232
    .line 233
    .line 234
    :cond_5
    const/4 v0, 0x0

    .line 235
    :goto_4
    iget-object v5, v1, Lb7/d1;->h:Landroidx/media3/exoplayer/offline/u;

    .line 236
    .line 237
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v6

    .line 241
    check-cast v6, Lm4/i0;

    .line 242
    .line 243
    invoke-static {v6, v0}, Lb7/x;->g(Lm4/i0;Landroid/graphics/Bitmap;)Lc7/q0;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    iget v6, p0, Lb7/y0;->b:I

    .line 248
    .line 249
    add-int/2addr v6, v4

    .line 250
    iget-object v5, v5, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v5, Lc7/j0;

    .line 253
    .line 254
    iget-object v7, v5, Lc7/j0;->a:Landroid/media/session/MediaController;

    .line 255
    .line 256
    invoke-virtual {v7}, Landroid/media/session/MediaController;->getFlags()J

    .line 257
    .line 258
    .line 259
    move-result-wide v7

    .line 260
    const-wide/16 v9, 0x4

    .line 261
    .line 262
    and-long/2addr v7, v9

    .line 263
    const-wide/16 v9, 0x0

    .line 264
    .line 265
    cmp-long v11, v7, v9

    .line 266
    .line 267
    if-eqz v11, :cond_6

    .line 268
    .line 269
    new-instance v7, Landroid/os/Bundle;

    .line 270
    .line 271
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 272
    .line 273
    .line 274
    sget-object v8, Landroid/support/v4/media/MediaDescriptionCompat;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 275
    .line 276
    invoke-static {v0, v8}, Llc/b;->o(Landroid/os/Parcelable;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    const-string v8, "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"

    .line 281
    .line 282
    invoke-virtual {v7, v8, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 283
    .line 284
    .line 285
    const-string v0, "android.support.v4.media.session.command.ARGUMENT_INDEX"

    .line 286
    .line 287
    invoke-virtual {v7, v0, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 288
    .line 289
    .line 290
    const/4 v0, 0x0

    .line 291
    iget-object v5, v5, Lc7/j0;->a:Landroid/media/session/MediaController;

    .line 292
    .line 293
    const-string v6, "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT"

    .line 294
    .line 295
    invoke-virtual {v5, v6, v7, v0}, Landroid/media/session/MediaController;->sendCommand(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V

    .line 296
    .line 297
    .line 298
    add-int/lit8 v4, v4, 0x1

    .line 299
    .line 300
    goto :goto_2

    .line 301
    :cond_6
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 302
    .line 303
    const-string v1, "This session doesn\'t support queue management operations"

    .line 304
    .line 305
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    throw v0

    .line 309
    :cond_7
    return-void

    .line 310
    nop

    .line 311
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
