.class public final Ljg/a;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final a:Ljg/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljg/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ljg/a;->a:Ljg/a;

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
.end method

.method public static a(C)Z
    .locals 4

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-gt v0, p0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    const/16 v3, 0x39

    .line 11
    .line 12
    if-gt p0, v3, :cond_1

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    :cond_1
    and-int p0, v0, v1

    .line 16
    .line 17
    return p0
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
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, Ljava/lang/CharSequence;

    .line 4
    .line 5
    move-object/from16 v1, p2

    .line 6
    .line 7
    check-cast v1, Ljava/lang/CharSequence;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    :goto_0
    if-ge v5, v2, :cond_7

    .line 21
    .line 22
    if-ge v6, v3, :cond_7

    .line 23
    .line 24
    add-int/lit8 v7, v5, 0x1

    .line 25
    .line 26
    invoke-interface {v0, v5}, Ljava/lang/CharSequence;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    add-int/lit8 v8, v6, 0x1

    .line 31
    .line 32
    invoke-interface {v1, v6}, Ljava/lang/CharSequence;->charAt(I)C

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    invoke-static {v5}, Ljg/a;->a(C)Z

    .line 37
    .line 38
    .line 39
    move-result v9

    .line 40
    invoke-static {v6}, Ljg/a;->a(C)Z

    .line 41
    .line 42
    .line 43
    move-result v10

    .line 44
    if-eqz v9, :cond_0

    .line 45
    .line 46
    if-nez v10, :cond_0

    .line 47
    .line 48
    goto/16 :goto_4

    .line 49
    .line 50
    :cond_0
    if-nez v9, :cond_1

    .line 51
    .line 52
    if-eqz v10, :cond_1

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_1
    if-nez v9, :cond_3

    .line 56
    .line 57
    if-nez v10, :cond_3

    .line 58
    .line 59
    invoke-static {v5}, Ljava/lang/Character;->toLowerCase(C)C

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    invoke-static {v6}, Ljava/lang/Character;->toLowerCase(C)C

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    sub-int/2addr v5, v6

    .line 68
    if-eqz v5, :cond_2

    .line 69
    .line 70
    return v5

    .line 71
    :cond_2
    move v5, v7

    .line 72
    move v6, v8

    .line 73
    goto :goto_0

    .line 74
    :cond_3
    add-int/lit8 v5, v5, -0x30

    .line 75
    .line 76
    int-to-long v9, v5

    .line 77
    :goto_1
    const-wide/16 v11, 0xa

    .line 78
    .line 79
    if-ge v7, v2, :cond_4

    .line 80
    .line 81
    add-int/lit8 v5, v7, 0x1

    .line 82
    .line 83
    invoke-interface {v0, v7}, Ljava/lang/CharSequence;->charAt(I)C

    .line 84
    .line 85
    .line 86
    move-result v13

    .line 87
    invoke-static {v13}, Ljg/a;->a(C)Z

    .line 88
    .line 89
    .line 90
    move-result v14

    .line 91
    if-eqz v14, :cond_4

    .line 92
    .line 93
    mul-long v9, v9, v11

    .line 94
    .line 95
    add-int/lit8 v13, v13, -0x30

    .line 96
    .line 97
    int-to-long v11, v13

    .line 98
    add-long/2addr v9, v11

    .line 99
    move v7, v5

    .line 100
    goto :goto_1

    .line 101
    :cond_4
    add-int/lit8 v6, v6, -0x30

    .line 102
    .line 103
    int-to-long v5, v6

    .line 104
    :goto_2
    if-ge v8, v3, :cond_5

    .line 105
    .line 106
    add-int/lit8 v13, v8, 0x1

    .line 107
    .line 108
    invoke-interface {v1, v8}, Ljava/lang/CharSequence;->charAt(I)C

    .line 109
    .line 110
    .line 111
    move-result v14

    .line 112
    invoke-static {v14}, Ljg/a;->a(C)Z

    .line 113
    .line 114
    .line 115
    move-result v15

    .line 116
    if-eqz v15, :cond_5

    .line 117
    .line 118
    mul-long v5, v5, v11

    .line 119
    .line 120
    add-int/lit8 v14, v14, -0x30

    .line 121
    .line 122
    int-to-long v14, v14

    .line 123
    add-long/2addr v5, v14

    .line 124
    move v8, v13

    .line 125
    goto :goto_2

    .line 126
    :cond_5
    cmp-long v11, v9, v5

    .line 127
    .line 128
    if-eqz v11, :cond_2

    .line 129
    .line 130
    const-wide/high16 v0, -0x8000000000000000L

    .line 131
    .line 132
    add-long/2addr v9, v0

    .line 133
    add-long/2addr v5, v0

    .line 134
    cmp-long v0, v9, v5

    .line 135
    .line 136
    if-gez v0, :cond_6

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_6
    if-nez v0, :cond_8

    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_7
    if-ge v5, v2, :cond_9

    .line 143
    .line 144
    :cond_8
    :goto_3
    const/4 v0, 0x1

    .line 145
    return v0

    .line 146
    :cond_9
    if-ge v6, v3, :cond_a

    .line 147
    .line 148
    :goto_4
    const/4 v0, -0x1

    .line 149
    return v0

    .line 150
    :cond_a
    :goto_5
    return v4
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
.end method
