.class public final Lj9/l;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lj9/l;->a:I

    iput-object p2, p0, Lj9/l;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/Comparator;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lj9/l;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj9/l;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 3

    .line 1
    iget v0, p0, Lj9/l;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lse/w;

    .line 7
    .line 8
    iget-object v0, p0, Lj9/l;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lic/k;

    .line 11
    .line 12
    invoke-static {p1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, p1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p2, Lse/w;

    .line 24
    .line 25
    invoke-static {p2}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, p2}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-static {p1, p2}, Lud/b;->j(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    return p1

    .line 41
    :pswitch_0
    iget-object v0, p0, Lj9/l;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Lj9/l;

    .line 44
    .line 45
    invoke-virtual {v0, p1, p2}, Lj9/l;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    check-cast p1, Lq2/o;

    .line 53
    .line 54
    iget p1, p1, Lq2/o;->g:I

    .line 55
    .line 56
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p2, Lq2/o;

    .line 61
    .line 62
    iget p2, p2, Lq2/o;->g:I

    .line 63
    .line 64
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-static {p1, p2}, Lud/b;->j(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    :goto_0
    return v0

    .line 73
    :pswitch_1
    iget-object v0, p0, Lj9/l;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Ljava/util/Comparator;

    .line 76
    .line 77
    invoke-interface {v0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    check-cast p1, Lq2/o;

    .line 85
    .line 86
    iget-object p1, p1, Lq2/o;->c:Li2/j0;

    .line 87
    .line 88
    check-cast p2, Lq2/o;

    .line 89
    .line 90
    iget-object p2, p2, Lq2/o;->c:Li2/j0;

    .line 91
    .line 92
    sget-object v0, Li2/j0;->T:Landroidx/media3/exoplayer/offline/i;

    .line 93
    .line 94
    invoke-virtual {v0, p1, p2}, Landroidx/media3/exoplayer/offline/i;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    :goto_1
    return v0

    .line 99
    :pswitch_2
    iget-object v0, p0, Lj9/l;->b:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v0, Lz9/o;

    .line 102
    .line 103
    invoke-virtual {v0, p1, p2}, Lz9/o;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    check-cast p1, Ljava/lang/Number;

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    return p1

    .line 114
    :pswitch_3
    check-cast p1, Ljava/lang/Number;

    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 117
    .line 118
    .line 119
    move-result-wide v0

    .line 120
    iget-object p1, p0, Lj9/l;->b:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast p1, Lo/a0;

    .line 123
    .line 124
    invoke-virtual {p1, v0, v1}, Lo/a0;->c(J)I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    check-cast p2, Ljava/lang/Number;

    .line 133
    .line 134
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 135
    .line 136
    .line 137
    move-result-wide v1

    .line 138
    invoke-virtual {p1, v1, v2}, Lo/a0;->c(J)I

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-static {v0, p1}, Lud/b;->j(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    return p1

    .line 151
    :pswitch_4
    iget-object v0, p0, Lj9/l;->b:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v0, Lj9/k;

    .line 154
    .line 155
    invoke-virtual {v0, p1, p2}, Lj9/k;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_2

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_2
    check-cast p1, Lj9/f;

    .line 163
    .line 164
    iget-object p1, p1, Lj9/f;->b:Ljava/lang/String;

    .line 165
    .line 166
    check-cast p2, Lj9/f;

    .line 167
    .line 168
    iget-object p2, p2, Lj9/f;->b:Ljava/lang/String;

    .line 169
    .line 170
    invoke-static {p1, p2}, Lud/b;->j(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    :goto_2
    return v0

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
