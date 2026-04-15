.class public final Lc7/d0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lc7/n;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lc/d;

.field public final synthetic e:Lb0/c1;


# direct methods
.method public constructor <init>(Lb0/c1;Lc7/n;Ljava/lang/String;Landroid/os/Bundle;Lc/d;)V
    .locals 0

    const/4 p4, 0x1

    iput p4, p0, Lc7/d0;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc7/d0;->e:Lb0/c1;

    iput-object p2, p0, Lc7/d0;->b:Lc7/n;

    iput-object p3, p0, Lc7/d0;->c:Ljava/lang/String;

    iput-object p5, p0, Lc7/d0;->d:Lc/d;

    return-void
.end method

.method public constructor <init>(Lb0/c1;Lc7/n;Ljava/lang/String;Lc/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lc7/d0;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc7/d0;->e:Lb0/c1;

    iput-object p2, p0, Lc7/d0;->b:Lc7/n;

    iput-object p3, p0, Lc7/d0;->c:Ljava/lang/String;

    iput-object p4, p0, Lc7/d0;->d:Lc/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lc7/d0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc7/d0;->b:Lc7/n;

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
    iget-object v1, p0, Lc7/d0;->e:Lb0/c1;

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
    if-nez v0, :cond_0

    .line 29
    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v1, "search for callback that isn\'t registered query="

    .line 33
    .line 34
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lc7/d0;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-string v1, "MBServiceCompat"

    .line 47
    .line 48
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    iget-object v1, v1, Lb0/c1;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Lc7/f0;

    .line 55
    .line 56
    iput-object v0, v1, Lc7/f0;->f:Lc7/s;

    .line 57
    .line 58
    const/4 v0, -0x1

    .line 59
    iget-object v2, p0, Lc7/d0;->d:Lc/d;

    .line 60
    .line 61
    const/4 v3, 0x0

    .line 62
    invoke-virtual {v2, v0, v3}, Lc/d;->b(ILandroid/os/Bundle;)V

    .line 63
    .line 64
    .line 65
    iput-object v3, v1, Lc7/f0;->f:Lc7/s;

    .line 66
    .line 67
    :goto_0
    return-void

    .line 68
    :pswitch_0
    iget-object v0, p0, Lc7/d0;->b:Lc7/n;

    .line 69
    .line 70
    iget-object v0, v0, Lc7/n;->a:Landroid/os/Messenger;

    .line 71
    .line 72
    invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iget-object v1, p0, Lc7/d0;->e:Lb0/c1;

    .line 77
    .line 78
    iget-object v2, v1, Lb0/c1;->b:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v2, Lc7/f0;

    .line 81
    .line 82
    iget-object v2, v2, Lc7/f0;->e:Lo/e;

    .line 83
    .line 84
    invoke-virtual {v2, v0}, Lo/u0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, Lc7/s;

    .line 89
    .line 90
    if-nez v0, :cond_1

    .line 91
    .line 92
    new-instance v0, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    const-string v1, "getMediaItem for callback that isn\'t registered id="

    .line 95
    .line 96
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    iget-object v1, p0, Lc7/d0;->c:Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    const-string v1, "MBServiceCompat"

    .line 109
    .line 110
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_1
    iget-object v1, v1, Lb0/c1;->b:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v1, Lc7/f0;

    .line 117
    .line 118
    iput-object v0, v1, Lc7/f0;->f:Lc7/s;

    .line 119
    .line 120
    const/4 v0, 0x2

    .line 121
    and-int/2addr v0, v0

    .line 122
    const/4 v2, 0x0

    .line 123
    iget-object v3, p0, Lc7/d0;->d:Lc/d;

    .line 124
    .line 125
    if-eqz v0, :cond_2

    .line 126
    .line 127
    const/4 v0, -0x1

    .line 128
    invoke-virtual {v3, v0, v2}, Lc/d;->b(ILandroid/os/Bundle;)V

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_2
    new-instance v0, Landroid/os/Bundle;

    .line 133
    .line 134
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 135
    .line 136
    .line 137
    const-string v4, "media_item"

    .line 138
    .line 139
    invoke-virtual {v0, v4, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 140
    .line 141
    .line 142
    const/4 v4, 0x0

    .line 143
    invoke-virtual {v3, v4, v0}, Lc/d;->b(ILandroid/os/Bundle;)V

    .line 144
    .line 145
    .line 146
    :goto_1
    iput-object v2, v1, Lc7/f0;->f:Lc7/s;

    .line 147
    .line 148
    :goto_2
    return-void

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
