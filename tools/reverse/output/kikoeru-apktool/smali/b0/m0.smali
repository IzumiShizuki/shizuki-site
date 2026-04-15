.class public final Lb0/m0;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lb0/n0;Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lb0/m0;->b:I

    .line 1
    iput-object p1, p0, Lb0/m0;->f:Ljava/lang/Object;

    iput-object p2, p0, Lb0/m0;->c:Ljava/lang/Object;

    iput p3, p0, Lb0/m0;->d:I

    iput-object p4, p0, Lb0/m0;->g:Ljava/lang/Object;

    iput p5, p0, Lb0/m0;->e:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lic/k;Lj1/q;Lic/k;II)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lb0/m0;->b:I

    .line 2
    iput-object p1, p0, Lb0/m0;->f:Ljava/lang/Object;

    iput-object p2, p0, Lb0/m0;->c:Ljava/lang/Object;

    iput-object p3, p0, Lb0/m0;->g:Ljava/lang/Object;

    iput p4, p0, Lb0/m0;->d:I

    iput p5, p0, Lb0/m0;->e:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;ILb0/w0;Lf1/f;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lb0/m0;->b:I

    .line 3
    iput-object p1, p0, Lb0/m0;->c:Ljava/lang/Object;

    iput p2, p0, Lb0/m0;->d:I

    iput-object p3, p0, Lb0/m0;->f:Ljava/lang/Object;

    iput-object p4, p0, Lb0/m0;->g:Ljava/lang/Object;

    iput p5, p0, Lb0/m0;->e:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lb0/m0;->b:I

    .line 2
    .line 3
    move-object v4, p1

    .line 4
    check-cast v4, Lx0/o;

    .line 5
    .line 6
    check-cast p2, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 9
    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lb0/m0;->f:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v1, p1

    .line 17
    check-cast v1, Lic/k;

    .line 18
    .line 19
    iget-object p1, p0, Lb0/m0;->c:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v2, p1

    .line 22
    check-cast v2, Lj1/q;

    .line 23
    .line 24
    iget-object p1, p0, Lb0/m0;->g:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v3, p1

    .line 27
    check-cast v3, Lic/k;

    .line 28
    .line 29
    iget p1, p0, Lb0/m0;->d:I

    .line 30
    .line 31
    or-int/lit8 p1, p1, 0x1

    .line 32
    .line 33
    invoke-static {p1}, Lx0/v;->D(I)I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    iget v6, p0, Lb0/m0;->e:I

    .line 38
    .line 39
    invoke-static/range {v1 .. v6}, Landroidx/compose/ui/viewinterop/a;->b(Lic/k;Lj1/q;Lic/k;Lx0/o;II)V

    .line 40
    .line 41
    .line 42
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_0
    iget-object p1, p0, Lb0/m0;->f:Ljava/lang/Object;

    .line 46
    .line 47
    move-object v2, p1

    .line 48
    check-cast v2, Lb0/w0;

    .line 49
    .line 50
    iget-object p1, p0, Lb0/m0;->g:Ljava/lang/Object;

    .line 51
    .line 52
    move-object v3, p1

    .line 53
    check-cast v3, Lf1/f;

    .line 54
    .line 55
    iget p1, p0, Lb0/m0;->e:I

    .line 56
    .line 57
    or-int/lit8 p1, p1, 0x1

    .line 58
    .line 59
    invoke-static {p1}, Lx0/v;->D(I)I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    iget-object v0, p0, Lb0/m0;->c:Ljava/lang/Object;

    .line 64
    .line 65
    iget v1, p0, Lb0/m0;->d:I

    .line 66
    .line 67
    invoke-static/range {v0 .. v5}, Lb0/g0;->b(Ljava/lang/Object;ILb0/w0;Lf1/f;Lx0/o;I)V

    .line 68
    .line 69
    .line 70
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 71
    .line 72
    return-object p1

    .line 73
    :pswitch_1
    iget-object p1, p0, Lb0/m0;->f:Ljava/lang/Object;

    .line 74
    .line 75
    move-object v0, p1

    .line 76
    check-cast v0, Lb0/n0;

    .line 77
    .line 78
    iget p1, p0, Lb0/m0;->e:I

    .line 79
    .line 80
    or-int/lit8 p1, p1, 0x1

    .line 81
    .line 82
    invoke-static {p1}, Lx0/v;->D(I)I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    iget-object v1, p0, Lb0/m0;->c:Ljava/lang/Object;

    .line 87
    .line 88
    iget v2, p0, Lb0/m0;->d:I

    .line 89
    .line 90
    iget-object v3, p0, Lb0/m0;->g:Ljava/lang/Object;

    .line 91
    .line 92
    invoke-static/range {v0 .. v5}, Lb0/g0;->d(Lb0/n0;Ljava/lang/Object;ILjava/lang/Object;Lx0/o;I)V

    .line 93
    .line 94
    .line 95
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 96
    .line 97
    return-object p1

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
