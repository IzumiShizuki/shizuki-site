.class public abstract Lm4/z0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Lp4/c0;->a:I

    .line 2
    .line 3
    const/16 v0, 0x24

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v1, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lm4/z0;->a:Ljava/lang/String;

    .line 11
    .line 12
    return-void
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
.end method

.method public static a(Landroid/os/Bundle;)Lm4/z0;
    .locals 7

    .line 1
    sget-object v0, Lm4/z0;->a:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v2, :cond_9

    .line 11
    .line 12
    const/high16 v5, -0x40800000    # -1.0f

    .line 13
    .line 14
    if-eq v2, v4, :cond_6

    .line 15
    .line 16
    const/4 v6, 0x2

    .line 17
    if-eq v2, v6, :cond_3

    .line 18
    .line 19
    const/4 v5, 0x3

    .line 20
    if-ne v2, v5, :cond_2

    .line 21
    .line 22
    sget-object v2, Lm4/c1;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-ne v0, v5, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v4, 0x0

    .line 32
    :goto_0
    invoke-static {v4}, Lp4/c;->c(Z)V

    .line 33
    .line 34
    .line 35
    sget-object v0, Lm4/c1;->d:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {p0, v0, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    new-instance v0, Lm4/c1;

    .line 44
    .line 45
    sget-object v1, Lm4/c1;->e:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {p0, v1, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    invoke-direct {v0, p0}, Lm4/c1;-><init>(Z)V

    .line 52
    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_1
    new-instance p0, Lm4/c1;

    .line 56
    .line 57
    invoke-direct {p0}, Lm4/c1;-><init>()V

    .line 58
    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 62
    .line 63
    const-string v0, "Unknown RatingType: "

    .line 64
    .line 65
    invoke-static {v2, v0}, Lq/t0;->B(ILjava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p0

    .line 73
    :cond_3
    sget-object v2, Lm4/a1;->d:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-ne v0, v6, :cond_4

    .line 80
    .line 81
    const/4 v3, 0x1

    .line 82
    :cond_4
    invoke-static {v3}, Lp4/c;->c(Z)V

    .line 83
    .line 84
    .line 85
    sget-object v0, Lm4/a1;->d:Ljava/lang/String;

    .line 86
    .line 87
    const/4 v1, 0x5

    .line 88
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    sget-object v1, Lm4/a1;->e:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {p0, v1, v5}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    cmpl-float v1, p0, v5

    .line 99
    .line 100
    if-nez v1, :cond_5

    .line 101
    .line 102
    new-instance p0, Lm4/a1;

    .line 103
    .line 104
    invoke-direct {p0, v0}, Lm4/a1;-><init>(I)V

    .line 105
    .line 106
    .line 107
    return-object p0

    .line 108
    :cond_5
    new-instance v1, Lm4/a1;

    .line 109
    .line 110
    invoke-direct {v1, p0, v0}, Lm4/a1;-><init>(FI)V

    .line 111
    .line 112
    .line 113
    return-object v1

    .line 114
    :cond_6
    sget-object v2, Lm4/q0;->c:Ljava/lang/String;

    .line 115
    .line 116
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-ne v0, v4, :cond_7

    .line 121
    .line 122
    const/4 v3, 0x1

    .line 123
    :cond_7
    invoke-static {v3}, Lp4/c;->c(Z)V

    .line 124
    .line 125
    .line 126
    sget-object v0, Lm4/q0;->c:Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {p0, v0, v5}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    cmpl-float v0, p0, v5

    .line 133
    .line 134
    if-nez v0, :cond_8

    .line 135
    .line 136
    new-instance p0, Lm4/q0;

    .line 137
    .line 138
    invoke-direct {p0}, Lm4/q0;-><init>()V

    .line 139
    .line 140
    .line 141
    return-object p0

    .line 142
    :cond_8
    new-instance v0, Lm4/q0;

    .line 143
    .line 144
    invoke-direct {v0, p0}, Lm4/q0;-><init>(F)V

    .line 145
    .line 146
    .line 147
    return-object v0

    .line 148
    :cond_9
    sget-object v2, Lm4/s;->d:Ljava/lang/String;

    .line 149
    .line 150
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-nez v0, :cond_a

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_a
    const/4 v4, 0x0

    .line 158
    :goto_1
    invoke-static {v4}, Lp4/c;->c(Z)V

    .line 159
    .line 160
    .line 161
    sget-object v0, Lm4/s;->d:Ljava/lang/String;

    .line 162
    .line 163
    invoke-virtual {p0, v0, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-eqz v0, :cond_b

    .line 168
    .line 169
    new-instance v0, Lm4/s;

    .line 170
    .line 171
    sget-object v1, Lm4/s;->e:Ljava/lang/String;

    .line 172
    .line 173
    invoke-virtual {p0, v1, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 174
    .line 175
    .line 176
    move-result p0

    .line 177
    invoke-direct {v0, p0}, Lm4/s;-><init>(Z)V

    .line 178
    .line 179
    .line 180
    return-object v0

    .line 181
    :cond_b
    new-instance p0, Lm4/s;

    .line 182
    .line 183
    invoke-direct {p0}, Lm4/s;-><init>()V

    .line 184
    .line 185
    .line 186
    return-object p0
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


# virtual methods
.method public abstract b()Z
.end method

.method public abstract c()Landroid/os/Bundle;
.end method
