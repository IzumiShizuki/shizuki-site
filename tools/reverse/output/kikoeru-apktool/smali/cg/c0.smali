.class public final Lcg/c0;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lcg/v;

.field public final synthetic d:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Lcg/v;Landroid/app/Activity;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcg/c0;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Lcg/c0;->c:Lcg/v;

    .line 4
    .line 5
    iput-object p2, p0, Lcg/c0;->d:Landroid/app/Activity;

    .line 6
    .line 7
    const/4 p1, 0x1

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
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lcg/c0;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lx0/f0;

    .line 7
    .line 8
    const-string v0, "$this$DisposableEffect"

    .line 9
    .line 10
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lcg/c0;->c:Lcg/v;

    .line 14
    .line 15
    iget-object v0, p1, Lcg/v;->b:Landroidx/media3/exoplayer/ExoPlayer;

    .line 16
    .line 17
    iget-object v1, p1, Lcg/v;->t:Ldg/a;

    .line 18
    .line 19
    move-object v2, v0

    .line 20
    check-cast v2, Lv4/v;

    .line 21
    .line 22
    iget-object v3, v2, Lv4/v;->x:Lv4/s;

    .line 23
    .line 24
    invoke-virtual {v2}, Lv4/v;->m2()V

    .line 25
    .line 26
    .line 27
    const/4 v4, 0x1

    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v6, 0x0

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    move-object v1, v6

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {v1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    :goto_0
    invoke-virtual {v2}, Lv4/v;->m2()V

    .line 39
    .line 40
    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    invoke-virtual {v2}, Lv4/v;->m2()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Lv4/v;->Y1()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v6}, Lv4/v;->f2(Landroid/view/Surface;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v5, v5}, Lv4/v;->S1(II)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    invoke-virtual {v2}, Lv4/v;->Y1()V

    .line 57
    .line 58
    .line 59
    iput-boolean v4, v2, Lv4/v;->Q:Z

    .line 60
    .line 61
    iput-object v1, v2, Lv4/v;->O:Landroid/view/SurfaceHolder;

    .line 62
    .line 63
    invoke-interface {v1, v3}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    if-eqz v3, :cond_2

    .line 71
    .line 72
    invoke-virtual {v3}, Landroid/view/Surface;->isValid()Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-eqz v4, :cond_2

    .line 77
    .line 78
    invoke-virtual {v2, v3}, Lv4/v;->f2(Landroid/view/Surface;)V

    .line 79
    .line 80
    .line 81
    invoke-interface {v1}, Landroid/view/SurfaceHolder;->getSurfaceFrame()Landroid/graphics/Rect;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    invoke-virtual {v2, v3, v1}, Lv4/v;->S1(II)V

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_2
    invoke-virtual {v2, v6}, Lv4/v;->f2(Landroid/view/Surface;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v5, v5}, Lv4/v;->S1(II)V

    .line 101
    .line 102
    .line 103
    :goto_1
    check-cast v0, Landroidx/lifecycle/q;

    .line 104
    .line 105
    const/high16 v1, 0x3f800000    # 1.0f

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Landroidx/lifecycle/q;->y1(F)V

    .line 108
    .line 109
    .line 110
    iput v1, p1, Lcg/v;->o:F

    .line 111
    .line 112
    iget-object v0, p1, Lcg/v;->n:Lx0/e1;

    .line 113
    .line 114
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    iget-object v0, p0, Lcg/c0;->d:Landroid/app/Activity;

    .line 120
    .line 121
    invoke-virtual {v0}, Landroid/app/Activity;->getRequestedOrientation()I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    new-instance v2, Lcg/h0;

    .line 126
    .line 127
    invoke-direct {v2, p1, v0, v1}, Lcg/h0;-><init>(Lcg/v;Landroid/app/Activity;I)V

    .line 128
    .line 129
    .line 130
    return-object v2

    .line 131
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    iget-object v0, p0, Lcg/c0;->d:Landroid/app/Activity;

    .line 138
    .line 139
    const/4 v1, 0x0

    .line 140
    iget-object v2, p0, Lcg/c0;->c:Lcg/v;

    .line 141
    .line 142
    invoke-virtual {v2, p1, v1, v0}, Lcg/v;->G(ZZLandroid/app/Activity;)V

    .line 143
    .line 144
    .line 145
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 146
    .line 147
    return-object p1

    .line 148
    nop

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
.end method
