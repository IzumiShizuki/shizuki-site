.class public final Lc7/b0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lc7/n;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Landroid/os/Bundle;

.field public final synthetic e:Lb0/c1;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lb0/c1;Lc7/n;Ljava/lang/String;Landroid/os/Bundle;Lc/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lc7/b0;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc7/b0;->e:Lb0/c1;

    iput-object p2, p0, Lc7/b0;->b:Lc7/n;

    iput-object p3, p0, Lc7/b0;->c:Ljava/lang/String;

    iput-object p4, p0, Lc7/b0;->d:Landroid/os/Bundle;

    iput-object p5, p0, Lc7/b0;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lb0/c1;Lc7/n;Ljava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lc7/b0;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc7/b0;->e:Lb0/c1;

    iput-object p2, p0, Lc7/b0;->b:Lc7/n;

    iput-object p3, p0, Lc7/b0;->c:Ljava/lang/String;

    iput-object p4, p0, Lc7/b0;->f:Ljava/lang/Object;

    iput-object p5, p0, Lc7/b0;->d:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    .line 1
    iget v0, p0, Lc7/b0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc7/b0;->b:Lc7/n;

    .line 7
    .line 8
    iget-object v0, v0, Lc7/n;->a:Landroid/os/Messenger;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lc7/b0;->e:Lb0/c1;

    .line 15
    .line 16
    iget-object v2, v1, Lb0/c1;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Lc7/f0;

    .line 19
    .line 20
    iget-object v2, v2, Lc7/f0;->e:Lo/e;

    .line 21
    .line 22
    invoke-virtual {v2, v0}, Lo/u0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lc7/s;

    .line 27
    .line 28
    iget-object v2, p0, Lc7/b0;->d:Landroid/os/Bundle;

    .line 29
    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v1, "sendCustomAction for callback that isn\'t registered action="

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, Lc7/b0;->c:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ", extras="

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const-string v1, "MBServiceCompat"

    .line 57
    .line 58
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    iget-object v1, v1, Lb0/c1;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Lc7/f0;

    .line 65
    .line 66
    iget-object v3, p0, Lc7/b0;->f:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v3, Lc/d;

    .line 69
    .line 70
    iput-object v0, v1, Lc7/f0;->f:Lc7/s;

    .line 71
    .line 72
    if-nez v2, :cond_1

    .line 73
    .line 74
    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 75
    .line 76
    :cond_1
    const/4 v0, -0x1

    .line 77
    const/4 v2, 0x0

    .line 78
    invoke-virtual {v3, v0, v2}, Lc/d;->b(ILandroid/os/Bundle;)V

    .line 79
    .line 80
    .line 81
    iput-object v2, v1, Lc7/f0;->f:Lc7/s;

    .line 82
    .line 83
    :goto_0
    return-void

    .line 84
    :pswitch_0
    iget-object v0, p0, Lc7/b0;->b:Lc7/n;

    .line 85
    .line 86
    iget-object v0, v0, Lc7/n;->a:Landroid/os/Messenger;

    .line 87
    .line 88
    invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iget-object v1, p0, Lc7/b0;->e:Lb0/c1;

    .line 93
    .line 94
    iget-object v2, v1, Lb0/c1;->b:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v2, Lc7/f0;

    .line 97
    .line 98
    iget-object v2, v2, Lc7/f0;->e:Lo/e;

    .line 99
    .line 100
    invoke-virtual {v2, v0}, Lo/u0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    move-object v5, v0

    .line 105
    check-cast v5, Lc7/s;

    .line 106
    .line 107
    if-nez v5, :cond_2

    .line 108
    .line 109
    new-instance v0, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    const-string v1, "addSubscription for callback that isn\'t registered id="

    .line 112
    .line 113
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    iget-object v1, p0, Lc7/b0;->c:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    const-string v1, "MBServiceCompat"

    .line 126
    .line 127
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 128
    .line 129
    .line 130
    goto/16 :goto_2

    .line 131
    .line 132
    :cond_2
    iget-object v0, v5, Lc7/s;->f:Ljava/util/HashMap;

    .line 133
    .line 134
    iget-object v1, v1, Lb0/c1;->b:Ljava/lang/Object;

    .line 135
    .line 136
    move-object v3, v1

    .line 137
    check-cast v3, Lc7/f0;

    .line 138
    .line 139
    iget-object v1, p0, Lc7/b0;->f:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v1, Landroid/os/IBinder;

    .line 142
    .line 143
    iget-object v4, p0, Lc7/b0;->c:Ljava/lang/String;

    .line 144
    .line 145
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    check-cast v2, Ljava/util/List;

    .line 150
    .line 151
    if-nez v2, :cond_3

    .line 152
    .line 153
    new-instance v2, Ljava/util/ArrayList;

    .line 154
    .line 155
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 156
    .line 157
    .line 158
    :cond_3
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    :cond_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v7

    .line 166
    move v8, v7

    .line 167
    iget-object v7, p0, Lc7/b0;->d:Landroid/os/Bundle;

    .line 168
    .line 169
    if-eqz v8, :cond_8

    .line 170
    .line 171
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v8

    .line 175
    check-cast v8, Lt3/b;

    .line 176
    .line 177
    iget-object v9, v8, Lt3/b;->a:Ljava/lang/Object;

    .line 178
    .line 179
    if-ne v1, v9, :cond_4

    .line 180
    .line 181
    iget-object v8, v8, Lt3/b;->b:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v8, Landroid/os/Bundle;

    .line 184
    .line 185
    if-ne v7, v8, :cond_5

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_5
    const-string v9, "android.media.browse.extra.PAGE_SIZE"

    .line 189
    .line 190
    const-string v10, "android.media.browse.extra.PAGE"

    .line 191
    .line 192
    const/4 v11, -0x1

    .line 193
    if-nez v7, :cond_6

    .line 194
    .line 195
    invoke-static {v8}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v8, v10, v11}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 199
    .line 200
    .line 201
    move-result v7

    .line 202
    if-ne v7, v11, :cond_4

    .line 203
    .line 204
    invoke-virtual {v8, v9, v11}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 205
    .line 206
    .line 207
    move-result v7

    .line 208
    if-ne v7, v11, :cond_4

    .line 209
    .line 210
    goto :goto_2

    .line 211
    :cond_6
    if-nez v8, :cond_7

    .line 212
    .line 213
    invoke-virtual {v7, v10, v11}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 214
    .line 215
    .line 216
    move-result v8

    .line 217
    if-ne v8, v11, :cond_4

    .line 218
    .line 219
    invoke-virtual {v7, v9, v11}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 220
    .line 221
    .line 222
    move-result v7

    .line 223
    if-ne v7, v11, :cond_4

    .line 224
    .line 225
    goto :goto_2

    .line 226
    :cond_7
    invoke-virtual {v7, v10, v11}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 227
    .line 228
    .line 229
    move-result v12

    .line 230
    invoke-virtual {v8, v10, v11}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 231
    .line 232
    .line 233
    move-result v10

    .line 234
    if-ne v12, v10, :cond_4

    .line 235
    .line 236
    invoke-virtual {v7, v9, v11}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 237
    .line 238
    .line 239
    move-result v7

    .line 240
    invoke-virtual {v8, v9, v11}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 241
    .line 242
    .line 243
    move-result v8

    .line 244
    if-ne v7, v8, :cond_4

    .line 245
    .line 246
    goto :goto_2

    .line 247
    :cond_8
    new-instance v6, Lt3/b;

    .line 248
    .line 249
    invoke-direct {v6, v1, v7}, Lt3/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    new-instance v2, Lc7/p;

    .line 259
    .line 260
    move-object v6, v4

    .line 261
    invoke-direct/range {v2 .. v7}, Lc7/p;-><init>(Lc7/f0;Ljava/lang/Object;Lc7/s;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 262
    .line 263
    .line 264
    iput-object v5, v3, Lc7/f0;->f:Lc7/s;

    .line 265
    .line 266
    if-nez v7, :cond_9

    .line 267
    .line 268
    invoke-virtual {v2}, Lc7/p;->d()V

    .line 269
    .line 270
    .line 271
    goto :goto_1

    .line 272
    :cond_9
    const/4 v0, 0x1

    .line 273
    iput v0, v2, Lc7/p;->a:I

    .line 274
    .line 275
    invoke-virtual {v2}, Lc7/p;->d()V

    .line 276
    .line 277
    .line 278
    :goto_1
    const/4 v0, 0x0

    .line 279
    iput-object v0, v3, Lc7/f0;->f:Lc7/s;

    .line 280
    .line 281
    iget-boolean v1, v2, Lc7/p;->b:Z

    .line 282
    .line 283
    if-eqz v1, :cond_a

    .line 284
    .line 285
    iput-object v0, v3, Lc7/f0;->f:Lc7/s;

    .line 286
    .line 287
    :goto_2
    return-void

    .line 288
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 289
    .line 290
    new-instance v1, Ljava/lang/StringBuilder;

    .line 291
    .line 292
    const-string v2, "onLoadChildren must call detach() or sendResult() before returning for package="

    .line 293
    .line 294
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    iget-object v2, v5, Lc7/s;->a:Ljava/lang/String;

    .line 298
    .line 299
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    const-string v2, " id="

    .line 303
    .line 304
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    throw v0

    .line 318
    nop

    .line 319
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
