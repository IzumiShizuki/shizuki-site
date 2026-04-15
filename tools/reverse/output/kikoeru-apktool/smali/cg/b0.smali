.class public final Lcg/b0;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lcg/v;


# direct methods
.method public synthetic constructor <init>(Lcg/v;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcg/b0;->b:I

    iput-object p1, p0, Lcg/b0;->c:Lcg/v;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lcg/v;Lx0/w0;)V
    .locals 0

    const/4 p2, 0x3

    iput p2, p0, Lcg/b0;->b:I

    .line 2
    iput-object p1, p0, Lcg/b0;->c:Lcg/v;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lcg/b0;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lp1/b;

    .line 7
    .line 8
    iget-wide v0, p1, Lp1/b;->a:J

    .line 9
    .line 10
    iget-object p1, p0, Lcg/b0;->c:Lcg/v;

    .line 11
    .line 12
    iget-object v0, p1, Lcg/v;->b:Landroidx/media3/exoplayer/ExoPlayer;

    .line 13
    .line 14
    move-object v1, v0

    .line 15
    check-cast v1, Lv4/v;

    .line 16
    .line 17
    invoke-virtual {v1}, Lv4/v;->O1()Lm4/s0;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget v1, v1, Lm4/s0;->a:F

    .line 22
    .line 23
    iput v1, p1, Lcg/v;->o:F

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    int-to-float v2, v2

    .line 27
    mul-float v1, v1, v2

    .line 28
    .line 29
    check-cast v0, Landroidx/lifecycle/q;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroidx/lifecycle/q;->y1(F)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p1, Lcg/v;->n:Lx0/e1;

    .line 35
    .line 36
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 42
    .line 43
    return-object p1

    .line 44
    :pswitch_0
    check-cast p1, Lp1/b;

    .line 45
    .line 46
    iget-wide v0, p1, Lp1/b;->a:J

    .line 47
    .line 48
    const-string p1, "onTap"

    .line 49
    .line 50
    const-string v0, "GestureController"

    .line 51
    .line 52
    invoke-static {p1, v0}, Lg8/a;->T(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lcg/b0;->c:Lcg/v;

    .line 56
    .line 57
    iget-object v0, p1, Lcg/v;->e:Lx0/e1;

    .line 58
    .line 59
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_0

    .line 70
    .line 71
    iget-object p1, p1, Lcg/v;->e:Lx0/e1;

    .line 72
    .line 73
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    invoke-virtual {p1}, Lcg/v;->X()V

    .line 80
    .line 81
    .line 82
    :goto_0
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 83
    .line 84
    return-object p1

    .line 85
    :pswitch_1
    check-cast p1, Lp1/b;

    .line 86
    .line 87
    iget-wide v0, p1, Lp1/b;->a:J

    .line 88
    .line 89
    const-string p1, "onDoubleTap"

    .line 90
    .line 91
    const-string v0, "GestureController"

    .line 92
    .line 93
    invoke-static {p1, v0}, Lg8/a;->T(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    iget-object p1, p0, Lcg/b0;->c:Lcg/v;

    .line 97
    .line 98
    iget-object v0, p1, Lcg/v;->i:Lx0/e1;

    .line 99
    .line 100
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, Ljava/lang/Boolean;

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    xor-int/lit8 v0, v0, 0x1

    .line 111
    .line 112
    iget-object v1, p1, Lcg/v;->b:Landroidx/media3/exoplayer/ExoPlayer;

    .line 113
    .line 114
    check-cast v1, Lv4/v;

    .line 115
    .line 116
    invoke-virtual {v1, v0}, Lv4/v;->c2(Z)V

    .line 117
    .line 118
    .line 119
    const/4 v0, 0x0

    .line 120
    invoke-virtual {p1, v0}, Lcg/v;->V(Z)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, v0}, Lcg/v;->T(Z)V

    .line 124
    .line 125
    .line 126
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 127
    .line 128
    return-object p1

    .line 129
    :pswitch_2
    check-cast p1, Landroid/content/Context;

    .line 130
    .line 131
    const-string v0, "it"

    .line 132
    .line 133
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    iget-object p1, p0, Lcg/b0;->c:Lcg/v;

    .line 137
    .line 138
    iget-object p1, p1, Lcg/v;->t:Ldg/a;

    .line 139
    .line 140
    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 145
    .line 146
    const/4 v2, 0x0

    .line 147
    if-eqz v1, :cond_1

    .line 148
    .line 149
    check-cast v0, Landroid/view/ViewGroup;

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :catchall_0
    move-exception v0

    .line 153
    goto :goto_2

    .line 154
    :cond_1
    move-object v0, v2

    .line 155
    :goto_1
    if-eqz v0, :cond_2

    .line 156
    .line 157
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 158
    .line 159
    .line 160
    sget-object v2, Lub/a0;->a:Lub/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 161
    .line 162
    goto :goto_3

    .line 163
    :goto_2
    invoke-static {v0}, Lub/a;->b(Ljava/lang/Throwable;)Lub/m;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    :cond_2
    :goto_3
    invoke-static {v2}, Lub/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    if-eqz v0, :cond_3

    .line 172
    .line 173
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 174
    .line 175
    .line 176
    :cond_3
    return-object p1

    .line 177
    :pswitch_3
    check-cast p1, Ljava/lang/Number;

    .line 178
    .line 179
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 180
    .line 181
    .line 182
    move-result p1

    .line 183
    new-instance v0, Ljava/lang/StringBuilder;

    .line 184
    .line 185
    const-string v1, "onValueChange "

    .line 186
    .line 187
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    const-string v1, "EasyPlayerExtends"

    .line 198
    .line 199
    invoke-static {v0, v1}, Lg8/a;->T(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    iget-object v0, p0, Lcg/b0;->c:Lcg/v;

    .line 203
    .line 204
    invoke-virtual {v0, p1}, Lcg/v;->H(F)V

    .line 205
    .line 206
    .line 207
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 208
    .line 209
    return-object p1

    .line 210
    :pswitch_4
    check-cast p1, Ljava/lang/Boolean;

    .line 211
    .line 212
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 213
    .line 214
    .line 215
    move-result p1

    .line 216
    iget-object v0, p0, Lcg/b0;->c:Lcg/v;

    .line 217
    .line 218
    iget-object v1, v0, Lcg/v;->b:Landroidx/media3/exoplayer/ExoPlayer;

    .line 219
    .line 220
    check-cast v1, Lv4/v;

    .line 221
    .line 222
    invoke-virtual {v1, p1}, Lv4/v;->c2(Z)V

    .line 223
    .line 224
    .line 225
    const/4 p1, 0x0

    .line 226
    invoke-virtual {v0, p1}, Lcg/v;->V(Z)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0, p1}, Lcg/v;->T(Z)V

    .line 230
    .line 231
    .line 232
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 233
    .line 234
    return-object p1

    .line 235
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
