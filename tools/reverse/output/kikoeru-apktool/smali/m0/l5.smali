.class public abstract Lm0/l5;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Lx0/z;

.field public static final b:Lm0/m5;

.field public static final c:Lm0/m5;

.field public static final d:Lu0/e;

.field public static final e:Lu0/e;

.field public static final f:Lu0/e;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Li9/f;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    invoke-direct {v0, v1}, Li9/f;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lx0/z;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Lx0/z;-><init>(Lic/a;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lm0/l5;->a:Lx0/z;

    .line 14
    .line 15
    new-instance v0, Lm0/m5;

    .line 16
    .line 17
    sget-wide v1, Lq1/q;->h:J

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    const/high16 v4, 0x7fc00000    # Float.NaN

    .line 21
    .line 22
    invoke-direct {v0, v3, v4, v1, v2}, Lm0/m5;-><init>(ZFJ)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lm0/l5;->b:Lm0/m5;

    .line 26
    .line 27
    new-instance v0, Lm0/m5;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-direct {v0, v3, v4, v1, v2}, Lm0/m5;-><init>(ZFJ)V

    .line 31
    .line 32
    .line 33
    sput-object v0, Lm0/l5;->c:Lm0/m5;

    .line 34
    .line 35
    new-instance v0, Lu0/e;

    .line 36
    .line 37
    const v1, 0x3e23d70a    # 0.16f

    .line 38
    .line 39
    .line 40
    const v2, 0x3e75c28f    # 0.24f

    .line 41
    .line 42
    .line 43
    const v3, 0x3da3d70a    # 0.08f

    .line 44
    .line 45
    .line 46
    invoke-direct {v0, v1, v2, v3, v2}, Lu0/e;-><init>(FFFF)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lm0/l5;->d:Lu0/e;

    .line 50
    .line 51
    new-instance v0, Lu0/e;

    .line 52
    .line 53
    const v1, 0x3df5c28f    # 0.12f

    .line 54
    .line 55
    .line 56
    const v2, 0x3d23d70a    # 0.04f

    .line 57
    .line 58
    .line 59
    invoke-direct {v0, v3, v1, v2, v1}, Lu0/e;-><init>(FFFF)V

    .line 60
    .line 61
    .line 62
    sput-object v0, Lm0/l5;->e:Lu0/e;

    .line 63
    .line 64
    new-instance v0, Lu0/e;

    .line 65
    .line 66
    const v4, 0x3dcccccd    # 0.1f

    .line 67
    .line 68
    .line 69
    invoke-direct {v0, v3, v1, v2, v4}, Lu0/e;-><init>(FFFF)V

    .line 70
    .line 71
    .line 72
    sput-object v0, Lm0/l5;->f:Lu0/e;

    .line 73
    .line 74
    return-void
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
.end method

.method public static a(FIJZ)Lm0/m5;
    .locals 2

    .line 1
    and-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p4, 0x1

    .line 6
    :cond_0
    and-int/lit8 v0, p1, 0x2

    .line 7
    .line 8
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    const/high16 p0, 0x7fc00000    # Float.NaN

    .line 13
    .line 14
    :cond_1
    and-int/lit8 p1, p1, 0x4

    .line 15
    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    sget-wide p2, Lq1/q;->h:J

    .line 19
    .line 20
    :cond_2
    invoke-static {p0, v1}, Lf3/f;->a(FF)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_4

    .line 25
    .line 26
    sget-wide v0, Lq1/q;->h:J

    .line 27
    .line 28
    invoke-static {p2, p3, v0, v1}, Lq1/q;->c(JJ)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_4

    .line 33
    .line 34
    if-eqz p4, :cond_3

    .line 35
    .line 36
    sget-object p0, Lm0/l5;->b:Lm0/m5;

    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_3
    sget-object p0, Lm0/l5;->c:Lm0/m5;

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_4
    new-instance p1, Lm0/m5;

    .line 43
    .line 44
    invoke-direct {p1, p4, p0, p2, p3}, Lm0/m5;-><init>(ZFJ)V

    .line 45
    .line 46
    .line 47
    return-object p1
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
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
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
.end method
